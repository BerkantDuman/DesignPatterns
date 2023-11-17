package org.patterns.behaviroal.strategy;

public interface Encryptor {

    String encryptFile();

    Encryptor rsaEncryptor = () -> "Applying RSA encryption";

    Encryptor aesEncryptor = () -> "Applying AES encryption";
}
