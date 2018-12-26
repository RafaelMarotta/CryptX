package com.crypt.CryptX.Service;

import com.crypt.CryptX.POJO.Encryption;
import com.crypt.CryptX.Repository.EncryptionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncryptionFacade {
    @Autowired
    private EncryptionDAO encryptionDAO;

    public Encryption newEncryption(Encryption encryption){
        return encryptionDAO.save(encryption);
    }

    public List<Encryption> findAll(){
        return encryptionDAO.findAll();
    }
}
