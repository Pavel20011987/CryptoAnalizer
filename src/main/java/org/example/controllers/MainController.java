package org.example.controllers;

import org.example.commands.Action;
import org.example.entity.Result;

public class MainController {
    public Result doAction(String actionName, String[] parameters) {
        // action === encode
        //parameters=[text.txt, encrypted.txt, 12]
        Action action = Actions.find(actionName);
        return action.execute(parameters);
    }
}
