package com.crypt.CryptX.DTO.DecryptDTO;

import lombok.Data;
@Data

public class DecryptTextBaseDTO {

    public DecryptTextBaseDTO() {
        this.textToDecrypt = "";
    }

    private String textToDecrypt;
    private String textDecoded;
    private Object key;
}
