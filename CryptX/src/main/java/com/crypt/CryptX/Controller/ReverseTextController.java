package com.crypt.CryptX.Controller;

import com.crypt.CryptX.DTO.ReverseTextDTO;
import com.crypt.CryptX.Encryptions.ReverseText.ReverseText;
import com.crypt.CryptX.Service.ReverseTextFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/ReverseText/")
public class ReverseTextController {

    @Autowired
    private ReverseTextFacade reverseTextFacade;

    @GetMapping(value="/{text}")
    public String ReverseText(@PathVariable String text){
        ReverseTextDTO reverseTextDTO = new ReverseTextDTO();
        reverseTextDTO.setEncodetext(text);
        return reverseTextFacade.Encrypt(reverseTextDTO);
    }

}
