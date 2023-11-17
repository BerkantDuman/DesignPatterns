package org.patterns.behaviroal.strategy;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.pdf");
        AESEncryptor aesEncryptor = new AESEncryptor();
        Encryptor rsaEncryptor = () -> "Appying RSA encryption";
        file.encrypt(aesEncryptor);
        file.encrypt(rsaEncryptor);
        file.encrypt(Encryptor.rsaEncryptor);
    }
}
