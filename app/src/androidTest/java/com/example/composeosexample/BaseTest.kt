package com.example.composeosexample

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import com.example.composeosexample.presentation.MainActivity
import org.junit.Rule

open class BaseTest {

    @get:Rule
    val activityTestRule = createAndroidComposeRule<MainActivity>()
}