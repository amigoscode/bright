package com.amigoscode.phonenumber;

public class PhoneNumberValidator {

    public boolean isValid(String phoneNumber) {
        return phoneNumber.startsWith("+447");
    }

}
