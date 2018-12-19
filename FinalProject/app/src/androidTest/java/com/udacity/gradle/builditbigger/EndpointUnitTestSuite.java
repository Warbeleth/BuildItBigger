package com.udacity.gradle.builditbigger;

import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
public class EndpointUnitTestSuite {

    /**
     * The ActivityTestRule is a rule provided by Android used for functional testing of a single
     * activity. The activity that will be tested will be launched before each test that's annotated
     * with @Test and before methods annotated with @Before. The activity will be terminated after
     * the test and methods annotated with @After are complete. This rule allows you to directly
     * access the activity during the test.
     */
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    //Free joke unit test...
    @Test
    public void verifyFreeJoke() throws Exception {
        onView(withId(R.id.button_tell_joke)).perform(ViewActions.click());

        ViewInteraction check = onView(withId(R.id.tv_joke_to_display)).check(matches(not(withText(""))));
        ViewInteraction check2 = onView(withId(R.id.tv_joke_to_display)).check(matches(not((withText(containsString("failed to connect"))))));
    }
}
