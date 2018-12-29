package com.crypt.CryptX.Encryptions.CipherCaesar;

import com.crypt.CryptX.DTO.EncryptDTO.EncryptTextBaseDTO;
import com.crypt.CryptX.Encryptions.BaseEncryption;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class CipherCaesar extends BaseEncryption {


    private char EncryptChar(char character,int key){
        for (int i=0;i<26;i++){
            if(alphabet.toCharArray()[i] == character){
                if(i+key < 26){
                    return alphabet.toCharArray()[i+key];
                }
                return alphabet.toCharArray()[(i+key)-26];
            }
        }
        return character;
    }

    private char DecryptChar(char character,int key){
        for(int i=0;i<26;i++){
            if(alphabet.toCharArray()[i] == character ){
                if(i-key > -1){
                    return alphabet.toCharArray()[i-key];
                }
                return alphabet.toCharArray()[i+26-key];
            }
        }
        return character;
    }
}
