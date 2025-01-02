package org.example.controllers;

import org.example.commands.*;
import org.example.constants.Constants;
import org.example.exceptions.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder()),
    BRUTEFORCE(new BruteForce()),
    ANALYZE(new Analyze()),
    EXIT(new Exit());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action get(String actionName) {
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            String message = String.format(Constants.NOT_FOUND_ACTION_FORMAT, actionName);
            throw new AppException(message, e);
        }
    }

}
