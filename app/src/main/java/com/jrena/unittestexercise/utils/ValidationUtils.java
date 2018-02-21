package com.jrena.unittestexercise.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jesper on 2/14/18.
 */

public class ValidationUtils {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
    public static final Pattern VALID_NUMBER_REGEX =
            Pattern.compile("^\\d+(\\.\\d{1,2})?$");
    public static final Pattern VALID_PASSWORD_REGEX =
            Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{12,}$");
    public static final Pattern VALID_NAME_REGEX =
            Pattern.compile("^(\\D*)");

    public static boolean isValidEmail(String email) {
        Pattern pattern = VALID_EMAIL_ADDRESS_REGEX;
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static boolean isValidNumber(String number) {
        Pattern pattern = VALID_NUMBER_REGEX;
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }

    public static boolean isValidGender(String gender) {
        return gender != null && (gender.trim().equalsIgnoreCase("Male") ||
                gender.trim().equalsIgnoreCase("Female"));
    }

    public static boolean isValidPassword(String password) {
        Pattern pattern = VALID_PASSWORD_REGEX;
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }

    public static boolean isValidName(String name) {
        Pattern pattern = VALID_NAME_REGEX;
        Matcher matcher = pattern.matcher(name);

        return matcher.matches();
    }
}
