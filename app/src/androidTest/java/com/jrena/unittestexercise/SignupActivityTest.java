package com.jrena.unittestexercise;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Created by Louie M. Donios on 21/02/2018.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class SignupActivityTest {

    //@Rule
    //public ActivityTestRule<com.jrena.unittestexercise.signup.SignupActivity> mActivityRule = new ActivityTestRule<>(com.jrena.unittestexercise.signup.SignupActivity.class);

    @Test
    public void fillupForm(){
        onView(withId(R.id.txt_first_name)).perform(typeText("Louie"), closeSoftKeyboard());
    }

}