package org.example.commands;

import org.example.constants.Constants;
import org.example.entity.Result;
import org.example.entity.ResultCode;

public class Exit extends AbstractAction{
    @Override
    public Result execute(String[] parameters) {
        return new Result(ResultCode.OK, Constants.APPLICATION_CLOSED);
    }
}
