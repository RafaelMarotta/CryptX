package com.crypt.CryptX.Encryptions;

import com.crypt.CryptX.DTO.DecryptDTO.DecryptTextBaseDTO;
import com.crypt.CryptX.DTO.EncryptDTO.EncryptTextBaseDTO;

import java.util.List;

public interface EncryptionInterface<EncryptTextDTO extends EncryptTextBaseDTO,DecryptTextDTO extends DecryptTextBaseDTO> {
     EncryptTextDTO EncryptText(EncryptTextDTO encryptTextDTO);

     DecryptTextDTO DecryptText(DecryptTextDTO decryptTextDTO);

     List<DecryptTextDTO> ForceDecryptText(DecryptTextDTO decryptTextDTO);

}