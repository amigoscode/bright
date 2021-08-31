package com.amigoscode.person;

import com.amigoscode.phonenumber.PhoneNumberValidator;

public class PersonService {

    private PhoneNumberValidator phoneNumberValidator;

    public PersonService(PhoneNumberValidator phoneNumberValidator) {
        this.phoneNumberValidator = phoneNumberValidator;
    }

    public void insertPersonToDn(Person person) {
        if (!person.getEmail().contains("@")) {
            throw new IllegalArgumentException(person.getEmail() + " must be valid");
        }

        // check the phone is valid
        if (!phoneNumberValidator.isValid(person.getPhoneNumber())) {
            throw new IllegalArgumentException(person.getPhoneNumber() + " must be valid");
        }

        // save person to database
        // send person an email
    }

    public boolean isValid(String phoneNumber) {
        return phoneNumber.startsWith("+447");
    }
}
