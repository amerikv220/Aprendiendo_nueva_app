package com.example.minuevaapp

import androidx.lifecycle.ViewModelProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    private lateinit var viewModel: MainViewModel 

    @Before
    fun setUp() {
        val activityScenario = activityScenarioRule.scenario
        activityScenario.onActivity { activity ->
            viewModel = ViewModelProvider(activity)[MainViewModel::class.java]
        }
    }
    @Test
    fun testCompareButton() {
        
        onView(withId(R.id.ediText1)).perform(typeText("Mi nuevo proyecto"))
        onView(withId(R.id.ediText2)).perform(typeText("Hola amigos"))
        onView(withId(R.id.compareButton)).perform(click())

      
        onView(withId(R.id.resultTextView)).check(matches(withText("Las cadenas son diferentes")))
    }
}
