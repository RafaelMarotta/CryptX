package com.crypt.CryptX.POJO.Enums;

public enum KeyEnum {
    INT(1l,"Inteiro"),
    NULL(2l,"Não há keys para está criptografia");

    private Long id;
    private String descricao;
    KeyEnum(Long id,String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
}
