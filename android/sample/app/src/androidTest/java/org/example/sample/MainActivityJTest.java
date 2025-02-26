package org.example.sample;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isChecked;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityJTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void verifyTextIsDisplayed() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void verifyButtonCanBeClicked() {
        onView(withId(R.id.button)).perform(click());
        onView(withText("Have a nice day!")).check(matches(isDisplayed()));
    }

    @Test
    public void verifyCheckboxCanBeClicked() {
        onView(withId(R.id.checkBox)).perform(click());
        onView(withId(R.id.checkBox)).check(matches(isChecked()));
    }
}
