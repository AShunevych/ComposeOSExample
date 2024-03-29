package com.example.composeosexample

import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Test
import java.util.*
import kotlin.random.Random.Default.nextInt

class HelloWorldTest : BaseTest() {
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