package com.crypt.CryptX.Service;

import com.crypt.CryptX.DTO.EncryptDTO.EncryptReverseTextDTO;
import com.crypt.CryptX.Encryptions.ReverseText.ReverseText;
import org.springframework.stereotype.Service;

@Service
final public class ReverseTextFacade {

    private ReverseText reverseText = new ReverseText();

    public EncryptReverseTextDTO EncryptText(EncryptReverseTextDTO encryptReverseTextDTO) {
        return reverseText.EncryptText(encryptReverseTextDTO);
    }

}
