package org.example.controllers;

import org.example.commands.Action;
import org.example.commands.Decoder;
import org.example.commands.Encoder;
import org.example.exceptions.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
        try{
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch(IllegalArgumentException e) {
            throw new AppException("not found " + actionName, e);
        }

    }

}
