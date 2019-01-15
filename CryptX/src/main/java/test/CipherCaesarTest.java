package test;

import com.crypt.CryptX.Encryptions.CipherCaesar.CipherCaesar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CipherCaesarTest {
    private CipherCaesar cipherCaesar = new CipherCaesar();

    @Test
    public void testCharCipherEncodeCase(){
        char result = cipherCaesar.EncryptChar('A',25);
        assertEquals('Z',result);
    }

    @Test
    public void testCharCipherDecodeCase(){
        char result = cipherCaesar.DecryptChar('Z',25);
        assertEquals('A',result);
    }
}
