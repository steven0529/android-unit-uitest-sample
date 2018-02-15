package com.jrena.unittestexercise;

import com.jrena.unittestexercise.signup.utils.ValidationUtils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void isCorrectEmail() throws Exception {
        assertTrue(ValidationUtils.isValidEmail("sample@stratpoint.com"));
    }

    @Test
    public void isIncorrectEmail() throws Exception {
        assertFalse(ValidationUtils.isValidEmail("sample"));
    }

    @Test
    public void isCorrectNumber() throws Exception {
        assertTrue(ValidationUtils.isValidNumber("09274567890"));
    }

    @Test
    public void isIncorrectNumber() throws Exception {
        assertFalse(ValidationUtils.isValidNumber("09d943837h"));
    }

    @Test
    public void isCorrectGender() throws Exception {
        assertTrue(ValidationUtils.isValidGender("Male"));
    }

    @Test
    public void isIncorrectGender() throws Exception {
        assertFalse(ValidationUtils.isValidGender("Maleee"));
    }

    @Test
    public void isCorrectPasword() throws Exception {
        assertTrue(ValidationUtils.isValidPassword("tysfY67@qvGa"));
    }

    @Test
    public void isIncorrectPassword() throws Exception {
        assertFalse(ValidationUtils.isValidPassword("password"));
    }

    @Test
    public void isCorrectName() throws Exception {
        assertTrue(ValidationUtils.isValidName("Lebron James"));
    }

    @Test
    public void isIncorrectName() throws Exception {
        assertFalse(ValidationUtils.isValidName("Lebron01 James"));
    }
}