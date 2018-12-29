package com.crypt.CryptX.DTO.EncryptDTO;

import lombok.Data;

@Data
public class EncryptCipherCaesarDTO extends EncryptTextBaseDTO {
    public EncryptCipherCaesarDTO() {
        this.key = 0;
    }
}
