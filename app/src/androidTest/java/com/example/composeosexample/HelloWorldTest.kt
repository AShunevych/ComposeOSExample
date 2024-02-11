package com.example.composeosexample

import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Test
import java.util.*
import kotlin.random.Random.Default.nextInt

class HelloWorldTest : BaseTest() {

    val random = nextLongValue(5000..30000L)

    @Test
    fun testByText(){
        val text = activityTestRule.activity.getString(R.string.hello_world,"Android")

        activityTestRule
            .onNodeWithText(text = text)
            .assertExists(errorMessageOnFail = "view not exists")
    }

    @Test
    fun testByDesctription(){
        activityTestRule
            .onNodeWithContentDescription("hello world view")
            .assertExists(errorMessageOnFail = "view not exists")
    }

    @Test
    fun changeTextInButtonOnclick(){
        activityTestRule
            .onNodeWithText("Click")
            .performClick()

        activityTestRule
            .onNodeWithText("hello")
            .assertExists()
    }

    @Test
    fun test_random_time(){
        activityTestRule
            .onNodeWithText("Click")
            .performClick()

        activityTestRule
            .onNodeWithText("hello")
            .assertExists()
        Thread.sleep(random)
    }


    private fun nextLongValue(range: LongRange): Long {
        return (range.first + nextInt((range.last - range.first + 1).toInt()))
    }


    @Test
    fun test_3(){
        activityTestRule
            .onNodeWithText("Click")
            .performClick()

        activityTestRule
            .onNodeWithText("hello")
            .assertExists()
    }

    @Test
    fun test_long_test_10_seconds_passed(){
        Thread.sleep(random)
        activityTestRule
            .onNodeWithText("Click")
            .performClick()

        activityTestRule
            .onNodeWithText("hello")
            .assertExists()
    }

    @Test
    fun test_long_3_test(){
        Thread.sleep(random)
        activityTestRule
            .onNodeWithText("Click")
            .performClick()

        activityTestRule
            .onNodeWithText("hello")
            .assertExists()
    }

    @Test
    fun test_long_1_test(){
        Thread.sleep(random)
        activityTestRule
            .onNodeWithText("Click")
            .performClick()

        activityTestRule
            .onNodeWithText("hello")
            .assertExists()
    }

    @Test
    fun test_long_2(){
        Thread.sleep(random)
        activityTestRule
            .onNodeWithText("Click")
            .assertDoesNotExist()


        activityTestRule
            .onNodeWithText("hello")
            .assertExists()
    }


    @Test
    fun test_long_test_20_seconds_passed(){
        Thread.sleep(20_000)
        activityTestRule
            .onNodeWithText("Click")
            .performClick()

        activityTestRule
            .onNodeWithText("hello")
            .assertExists()
    }

    @Test
    fun test_failed(){
        activityTestRule
            .onNodeWithText("Click")
            .performClick()

        activityTestRule
            .onNodeWithText("hello")
            .assertDoesNotExist()
        Thread.sleep(20_000)
    }
}