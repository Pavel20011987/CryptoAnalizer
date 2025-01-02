package org.example.commands;

import org.example.entity.Result;
import org.example.entity.ResultCode;

public class Encoder implements Action{
    @Override
    public Result execute(String[] parameters) {
        //TODO something do
        return new Result("encode all right", ResultCode.OK);
    }
}
