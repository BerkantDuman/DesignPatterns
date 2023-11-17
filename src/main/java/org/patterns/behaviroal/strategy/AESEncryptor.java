package org.patterns.behaviroal.strategy;

public class AESEncryptor implements Encryptor{
    @Override
    public String encryptFile() {
        return "Applying AES encryption";
    }
}
