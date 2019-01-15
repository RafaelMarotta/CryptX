package com.crypt.CryptX.Service;

import com.crypt.CryptX.POJO.Encryption;
import com.crypt.CryptX.Repository.EncryptionDAO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncryptionFacade {
    private final EncryptionDAO encryptionDAO;

    @Autowired
    public EncryptionFacade(EncryptionDAO encryptionDAO) {
        this.encryptionDAO = encryptionDAO;
    }

    public Encryption newEncryption(Encryption encryption){
        if (encryption!= null && StringUtils.isNotBlank(encryption.getTitle())) {
            return encryptionDAO.save(encryption);
        }

        return null;
    }

    public List<Encryption> findAll(){
        return encryptionDAO.findAll();
    }
}
