package org.example.assignment.day2;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.salt.StringFixedSaltGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileEncrypt {
    public static void main(String[] args) throws IOException {
        String encryptedOutputFilePath = "MyGradle/src/main/resources/encrypted_abc.txt";
        String decryptedOutputFilePath = "decrypted_abc.txt";
        final String PW = "12341234";
        final String ALGORITHM = "PBEWithMD5AndDES";
        final String SALT_GENERATOR = "someFixedSalt";
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(PW);
        encryptor.setAlgorithm(ALGORITHM);
        encryptor.setSaltGenerator(new StringFixedSaltGenerator(SALT_GENERATOR));
        String decryptedText = encryptor.decrypt(readTextFile(encryptedOutputFilePath));

        System.out.println("Decrypted text: " + decryptedText);
        System.out.println("Decryption completed successfully.");
    }

    private static String readTextFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
