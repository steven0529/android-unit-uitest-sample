package com.jrena.unittestexercise;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.jrena.unittestexercise.signup.SignupActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.IsAnything.anything;
import static org.junit.Assert.*;

/**
 * Created by Louie M. Donios on 21/02/2018.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class SignupActivityTest {

    @Rule
    public ActivityTestRule<SignupActivity> mActivityRule = new ActivityTestRule<>(SignupActivity.class);

    @Test
    public void submitForm(){
        //fill up forms
        onView(withId(R.id.txt_first_name)).perform(typeText("Louie"), closeSoftKeyboard());
        onView(withId(R.id.txt_middle_name)).perform(typeText("Morales"), closeSoftKeyboard());
        onView(withId(R.id.txt_last_name)).perform(typeText("Donios"), closeSoftKeyboard());
        onView(withId(R.id.txt_phone_number)).perform(typeText("09776013876"),closeSoftKeyboard());
        onView(withId(R.id.spin_gender)).perform(click());
        onData(anything()).atPosition(1).perform(click());//choose female
        onView(withId(R.id.txt_email)).perform(typeText("ldonios@stratpoint.com"), closeSoftKeyboard());
        onView(withId(R.id.txt_password)).perform(typeText("abc123#"), closeSoftKeyboard());
        onView(withId(R.id.txt_confirm_password)).perform(typeText("abc123#"), closeSoftKeyboard());
        onView(withId(R.id.btn_submit)).perform(click());

    }

}