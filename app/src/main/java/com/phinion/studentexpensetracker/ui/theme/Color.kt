package com.phinion.studentexpensetracker.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
//val appPrimaryColor = Color(0xFF42224A)
//val appPrimaryVariant = Color(0xFF8F659A)
val Orange500 = Color(0xFFef8767)
val appLightColor = Color(0xFFFAE6FF)
val darkBackgroundColor = Color(0xFF151419)
val DarkGray800 = Color(0xFF43414B)
val darkBottomBarColor = Color(0xFF252429)
val mediumWhite = Color(0xFFEEEEEE)
val appPrimaryVariant = Color(0xFF2E8B57) // #2E8B57
val lightGreen = Color(0xFF61BC84) // #61bc84
val paleGreen = Color(0xFFC6FFE6) // #c6ffe6
val softGreen = Color(0xFF8FBC8F) // #8FBC8F
val darkgreen = Color(0xFF345E37) // #345e37
val whiteText = Color(0xFFFFFFFF) // #FFFFFF
val lightGray = Color(0xFFE0E0E0) // #e0e0e0
val appPrimaryColor = Color(0xFF1E1E1E) // #1E1E1E
val mediumDarkBackground = Color(0xFF2D2D2D) // #2d2d2d
val darkBackground = Color(0xFF454545) // #454545



val backgroundColor: Color
    @Composable
    get() =
        if (isSystemInDarkTheme()) darkBackgroundColor else Color.White

val bottomBackgroundColor: Color
@Composable
get() =
    if (isSystemInDarkTheme()) darkBottomBarColor else Color.White

val outcomeSectionColor: Color
@Composable
get() =
        if (isSystemInDarkTheme()) DarkGray800 else appPrimaryColor

val backgroundTextColor: Color
@Composable
get() =
        if (isSystemInDarkTheme()) Color.White else appPrimaryColor

val buttonBackgroundColor: Color
@Composable
get() =
    if (isSystemInDarkTheme()) darkgreen else appPrimaryColor

val onBoardingTextColor: Color
@Composable
get() =
    if(isSystemInDarkTheme()) darkBottomBarColor else appPrimaryColor

val bottomBarContentColor: Color
@Composable
get() =
    if (isSystemInDarkTheme()) Color.White else appPrimaryColor