package org.Task1;

import java.io.IOException;

public class PhoneNumberValidator {
    public static void main(String[] args) {
        try {
            PhoneValidator.validatePhoneNumbers("file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
