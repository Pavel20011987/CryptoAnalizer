package org.example.commands;

import org.example.entity.Result;
import org.example.entity.ResultCode;

public class BruteForce implements Action{
    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        return new Result("BruteForce completed", ResultCode.OK);
    }
}
