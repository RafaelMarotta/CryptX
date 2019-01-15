package com.crypt.CryptX.Encryptions.CipherCaesar;

import static com.crypt.CryptX.Utils.Alphabets.alphabetUpper;

public class CipherCaesar {

    public char EncryptChar(char character,int key){
        for (int i=0;i<26;i++){
            if(alphabetUpper.toCharArray()[i] == character){
                if(i+key < 26){
                    return alphabetUpper.toCharArray()[i+key];
                }
                return alphabetUpper.toCharArray()[(i+key)-26];
            }
        }
        return character;
    }

    public char DecryptChar(char character,int key){
        for(int i=0;i<26;i++){
            if(alphabetUpper.toCharArray()[i] == character ){
                if(i-key > -1){
                    return alphabetUpper.toCharArray()[i-key];
                }
                return alphabetUpper.toCharArray()[i+26-key];
            }
        }
        return character;
    }
}
