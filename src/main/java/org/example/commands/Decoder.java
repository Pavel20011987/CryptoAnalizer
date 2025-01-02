package org.example.commands;

import org.example.entity.Result;
import org.example.entity.ResultCode;

public class Decoder extends AbstractAction{
    @Override
    public Result execute(String[] parameters) {
        String encryptedFilename = parameters[0];
        String decryptedFilename = parameters[1];
        int key = Integer.parseInt(parameters[2]);
        return copyWithKey(encryptedFilename, decryptedFilename, -1 * key);
    }
}
