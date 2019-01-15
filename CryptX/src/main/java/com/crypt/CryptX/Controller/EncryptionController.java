package com.crypt.CryptX.Controller;

import com.crypt.CryptX.POJO.Encryption;
import com.crypt.CryptX.POJO.Enums.KeyEnum;
import com.crypt.CryptX.Service.EncryptionFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/Encrpytion")
public class EncryptionController {

    @Autowired
    private EncryptionFacade encryptionFacade;

   @GetMapping
    public List<Encryption> findAll() {
       return encryptionFacade.findAll();
   }

   @PostMapping
    public Encryption NewEncrpytion(@Valid @RequestBody Encryption encryption){
        return encryptionFacade.newEncryption(encryption);
   }

}
