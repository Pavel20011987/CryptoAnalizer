package org.example;

import org.example.controllers.MainController;
import org.example.entity.Result;
import org.example.exceptions.AppException;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Application {
    private final MainController mainController;
    public Application() {
        mainController = new MainController();

    }

    public Result run(String[] args) {
        //encode data.txt encrypted.txt 12
        if(args.length > 0) {
            String action = args[0];//encode
            //parameters - data.txt encrypted.txt 12
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);
            return mainController.doAction(action, parameters);
        } else {
            throw new AppException("no args");
        }
    }
}
