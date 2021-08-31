package com.amigoscode.phonenumber;

public class PhoneNumberValidator {

    public static boolean isValid(String phoneNumber) {
        return phoneNumber.startsWith("+447");
    }

}
