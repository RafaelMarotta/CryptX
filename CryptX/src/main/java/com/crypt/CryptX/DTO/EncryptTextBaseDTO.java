package com.crypt.CryptX.DTO;

import com.crypt.CryptX.POJO.Enums.KeyEnum;
import lombok.Data;

@Data
public abstract class EncryptTextBaseDTO {
    protected String encodetext;
    protected String decodeText;
    protected KeyEnum key;
}
