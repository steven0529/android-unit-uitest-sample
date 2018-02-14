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
    public void addition_isCorrectEmail() throws Exception {
        assertTrue(ValidationUtils.isValidEmail("sample@stratpoint.com"));
    }

    @Test
    public void addition_isIncorrectEmail() throws Exception {
        assertFalse(ValidationUtils.isValidEmail("sample@stratpoint"));
    }

    @Test
    public void addition_isCorrectNumber() throws Exception {
        assertTrue(ValidationUtils.isValidNumber("09274567890"));
    }

    @Test
    public void addition_isIncorrectNumber() throws Exception {
        assertFalse(ValidationUtils.isValidNumber("09d943837h"));
    }

    @Test
    public void addition_isCorrectGender() throws Exception {
        assertTrue(ValidationUtils.isValidGender("Male"));
    }

    @Test
    public void addition_isIncorrectGender() throws Exception {
        assertFalse(ValidationUtils.isValidGender("Maleee"));
    }

    @Test
    public void addition_isCorrectPasword() throws Exception {
        assertTrue(ValidationUtils.isValidPassword("tysfY67@qvGa"));
    }

    @Test
    public void addition_isIncorrectPassword() throws Exception {
        assertFalse(ValidationUtils.isValidPassword("password"));
    }

    @Test
    public void addition_isCorrectName() throws Exception {
        assertTrue(ValidationUtils.isValidPassword("Lebron James"));
    }

    @Test
    public void addition_isIncorrectName() throws Exception {
        assertFalse(ValidationUtils.isValidPassword("Lebron01 James"));
    }
}