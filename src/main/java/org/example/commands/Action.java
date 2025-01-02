package org.example.commands;

import org.example.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
