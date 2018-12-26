package com.crypt.CryptX.Encryptions;

import com.crypt.CryptX.DTO.EncryptTextBaseDTO;

public interface EncryptionInterface {
    String Encrypt(EncryptTextBaseDTO encryptTextBaseDTO);
    String Decrypt(EncryptTextBaseDTO encryptTextBaseDTO);
    //String ForceDecrypt();
}
