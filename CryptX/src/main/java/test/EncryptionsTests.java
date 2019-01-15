package test;

import com.crypt.CryptX.POJO.Encryption;
import com.crypt.CryptX.Repository.EncryptionDAO;
import com.crypt.CryptX.Service.EncryptionFacade;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class EncryptionsTests {

    @InjectMocks
    private EncryptionFacade encryptionFacade;

    @Mock
    private EncryptionDAO encryptionDAO;

    private Encryption encryption;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        encryption = new Encryption();
    }

    @Test
    public void newEncrpytionNull(){
        assertNull(encryptionFacade.newEncryption(encryption));
    }

    @Test
    public void listEncryptions(){
        List<Encryption> encryptionList = new ArrayList<Encryption>();
        encryptionList.add(new Encryption());

        when(encryptionFacade.findAll()).thenReturn(encryptionList);
        Assert.notNull(encryptionFacade.findAll(),"0 curence of encoders");
    }
}
