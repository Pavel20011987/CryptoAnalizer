package org.example.view.console;

import org.example.controllers.MainController;
import org.example.entity.Result;
import org.example.entity.ResultCode;


import java.util.Arrays;

@SuppressWarnings("ClassCanBeRecord")
public class ConsoleApp {
    private final MainController mainController;
    private final Menu menu;

    public ConsoleApp(MainController mainController, Menu menu) {
        this.mainController = mainController;
        this.menu = menu;
    }

    public void run(String[] args) {
        Result result;
        do {
            if (args.length == 0) {
                args = menu.getArgs();
            }
            result = getResult(args);
            print(result);
            args = new String[0];
        } while (result.resultCode == ResultCode.ERROR);
    }


    private Result getResult(String[] args) {
        String action = args[0];
        String[] parameters = Arrays.copyOfRange(args, 1, args.length);
        return mainController.doAction(action, parameters);
    }

    private void print(Result result) {
        String message = switch (result.resultCode) {
            case OK -> String.format(
                    Messages.OK_FORMAT, result.message
            );
            case ERROR -> String.format(
                    Messages.ERR_FORMAT, result.message
            );
        };
        System.out.println(message);
    }
}
