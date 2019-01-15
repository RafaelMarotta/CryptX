package com.crypt.CryptX.Utils;

import com.crypt.CryptX.DTO.EncryptDTO.EncryptTextBaseDTO;

public class BasicDTOValidator<EncryptDTOValidator extends EncryptTextBaseDTO> {
    public boolean validateEncryptDTO(EncryptDTOValidator dto){
        if(dto == null){
            return false;
        }
        if(dto.getTextToEncode().isEmpty()){
            return false;
        }

        return true;
    }
}
