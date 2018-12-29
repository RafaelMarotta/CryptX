package com.crypt.CryptX.POJO;

import com.crypt.CryptX.POJO.Enums.KeyEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@Table(name = "t_encryption")
@EqualsAndHashCode(of = "id")
public class Encryption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private char type;

    private String description;

    @Enumerated(EnumType.STRING)
    private KeyEnum key;

}
