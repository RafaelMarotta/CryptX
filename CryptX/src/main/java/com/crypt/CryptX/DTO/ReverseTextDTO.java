package com.crypt.CryptX.DTO;

import com.crypt.CryptX.POJO.Enums.KeyEnum;

public class ReverseTextDTO extends EncryptTextBaseDTO {
    public ReverseTextDTO() {
        this.encodetext = "";
        this.decodeText = "";
        this.key = null;
    }
}
