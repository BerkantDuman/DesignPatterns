package org.patterns.behaviroal.strategy;

public class RSAEncryptor implements Encryptor{
    @Override
    public String encryptFile() {
        return "Applying RSA encryption";
    }
}
