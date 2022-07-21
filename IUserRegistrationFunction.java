package com.blz.UserRegistrationException;

@FunctionalInterface
public interface IUserRegistrationFunction {
    boolean validate(String value, String pattern) throws UserDetailException;
}
