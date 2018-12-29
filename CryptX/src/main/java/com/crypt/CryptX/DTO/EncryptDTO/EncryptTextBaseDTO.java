package com.crypt.CryptX.DTO.EncryptDTO;

import lombok.Data;

@Data
public abstract class EncryptTextBaseDTO {

    public EncryptTextBaseDTO() {
        this.textToEncode = "";
    }

    protected String textToEncode;
    protected String textEncoded;
    protected Object key;
}
