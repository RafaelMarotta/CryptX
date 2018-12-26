package com.crypt.CryptX.Repository;

import com.crypt.CryptX.POJO.Encryption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncryptionDAO extends JpaRepository<Encryption,Long> {
}
