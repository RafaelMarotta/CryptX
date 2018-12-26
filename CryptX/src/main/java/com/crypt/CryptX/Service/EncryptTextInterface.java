package com.crypt.CryptX.Service;

import com.crypt.CryptX.DTO.EncryptTextBaseDTO;

public interface EncryptTextInterface {
    String Encrypt(EncryptTextBaseDTO encryptTextBaseDTO);
    String Decrypt(EncryptTextBaseDTO encryptTextBaseDTO);
}
