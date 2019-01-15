package test;

import com.crypt.CryptX.DTO.EncryptDTO.EncryptReverseTextDTO;
import com.crypt.CryptX.Service.ReverseTextFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ReverseTextTest {
    @Autowired
    ReverseTextFacade reverseText;

    @Test
    public void ReverseTextTest(){
        EncryptReverseTextDTO encryptReverseTextDTO = new EncryptReverseTextDTO();
        encryptReverseTextDTO.setTextToEncode("marotta");

        String result = (reverseText.EncryptText(null).getTextEncoded());

        assertEquals(result,"attoram");
    }
}
