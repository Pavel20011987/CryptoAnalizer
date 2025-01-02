package org.example;

import org.example.controllers.MainController;
import org.example.entity.Result;
import org.example.exceptions.AppException;

import java.util.Arrays;

public class Application {
    private MainController mainController;
    public Application() {
        mainController = new MainController();

    }

    public Result run(String[] args) {
        if(args.length > 0) {
            String action = args[0];
            String[] parameters = Arrays.copyOf(args, 1, args.length);
            Result result = mainController.doAction(action, parameters);
        }
        throw new AppException();
    }
}
