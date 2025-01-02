package org.example.controllers;

import org.example.commands.Action;
import org.example.entity.Result;
import org.example.entity.ResultCode;
import org.example.exceptions.AppException;

public class MainController {
    public Result doAction(String actionName, String[] parameters) {
        Action action = Actions.get(actionName);
        try {
            return action.execute(parameters);
        } catch (NumberFormatException | AppException e) {
            return new Result(ResultCode.ERROR, e.getMessage());
        }
    }
}
