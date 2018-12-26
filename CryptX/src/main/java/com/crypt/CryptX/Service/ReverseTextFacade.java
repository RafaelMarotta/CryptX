package com.crypt.CryptX.Service;

import com.crypt.CryptX.DTO.EncryptTextBaseDTO;
import com.crypt.CryptX.Encryptions.ReverseText.ReverseText;
import org.springframework.stereotype.Service;

@Service
final public class ReverseTextFacade implements EncryptTextInterface{

    private ReverseText reverseText = new ReverseText();

    @Override
    public String Encrypt(EncryptTextBaseDTO reverseTextDTO) {
        return reverseText.Encrypt(reverseTextDTO);
    }

    @Override
    public String Decrypt(EncryptTextBaseDTO reverseTextDTO) {
        return reverseText.Decrypt(reverseTextDTO);
    }
}
