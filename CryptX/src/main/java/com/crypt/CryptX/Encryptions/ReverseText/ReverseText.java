package com.crypt.CryptX.Encryptions.ReverseText;

import com.crypt.CryptX.DTO.EncryptDTO.EncryptReverseTextDTO;

public class ReverseText{

    public EncryptReverseTextDTO EncryptText(EncryptReverseTextDTO encryptReverseTextDTO) {
        encryptReverseTextDTO.setTextEncoded(Reverse(encryptReverseTextDTO.getTextToEncode()));
        return encryptReverseTextDTO;
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
