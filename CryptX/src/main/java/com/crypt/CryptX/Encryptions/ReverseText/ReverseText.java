package com.crypt.CryptX.Encryptions.ReverseText;

import com.crypt.CryptX.DTO.EncryptTextBaseDTO;
import com.crypt.CryptX.Encryptions.EncryptionInterface;

public class ReverseText implements EncryptionInterface {
    @Override
    public String Encrypt(EncryptTextBaseDTO encryptTextBaseDTO) {
        return Reverse(encryptTextBaseDTO.getEncodetext());
    }

    @Override
    public String Decrypt(EncryptTextBaseDTO encryptTextBaseDTO) {
        return Reverse(encryptTextBaseDTO.getDecodeText());
    }

    private String Reverse(String text){
        String reverse = "";
        StringBuilder stringBuilder = new StringBuilder();
        char[] textArray = text.toCharArray();
        for (int i=text.length()-1;i>=0;i--){
            reverse += Character.toString(textArray[i]);
        }
        return reverse;
    }
}
