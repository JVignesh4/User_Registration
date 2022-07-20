package com.blz.UserRegistrationException;

public class UserDetailsRegexPattern {
    static String FIRST_NAME_LAST_NAME = "^[A-Z][a-z]{2,}$";
    static String EMAIL = "^([a-z0-9]+([-$%&+.]?[0-9a-z]+))[@][a-z0-9]+[.][a-z]{3,}([.][a-z]{2,})?$";
    static String PHONE_NUMBER = "^([1-9]+[0-9]+)[\\s][0-9]{10}$";
    static String PASSWORD = "^([a-z]){8,20}$";

}