package org.Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class PhoneValidator {
    public static void validatePhoneNumbers(String filename) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (PhoneNumber.isValidPhoneNumber(line)) {
                    System.out.println(line);
                }
            }
        }
    }
}
