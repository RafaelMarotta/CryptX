package com.crypt.CryptX.Service;

import com.crypt.CryptX.DTO.EncryptDTO.EncryptReverseTextDTO;
import com.crypt.CryptX.Encryptions.ReverseText.ReverseText;
import com.crypt.CryptX.Utils.BasicDTOValidator;
import org.springframework.stereotype.Service;

@Service
final public class ReverseTextFacade {

    private BasicDTOValidator validator = new BasicDTOValidator<EncryptReverseTextDTO>();
    private ReverseText reverseText = new ReverseText();

    public EncryptReverseTextDTO EncryptText(EncryptReverseTextDTO encryptReverseTextDTO) {
        if(validator.validateEncryptDTO(encryptReverseTextDTO)){
            return reverseText.EncryptText(encryptReverseTextDTO);
        }
        return null;
    }

}
