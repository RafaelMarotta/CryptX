package com.crypt.CryptX.Controller;

import com.crypt.CryptX.DTO.EncryptDTO.EncryptReverseTextDTO;
import com.crypt.CryptX.Service.ReverseTextFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/ReverseText/")
public class ReverseTextController {

    @Autowired
    private ReverseTextFacade reverseTextFacade;

    @GetMapping(value="/{text}")
    public EncryptReverseTextDTO ReverseText(@PathVariable String text){
        EncryptReverseTextDTO encryptReverseTextDTO = new EncryptReverseTextDTO();
        encryptReverseTextDTO.setTextToEncode(text);
        return reverseTextFacade.EncryptText(encryptReverseTextDTO);
    }

}
