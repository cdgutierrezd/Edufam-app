package com.cdgutierrezd.edufam.screens.login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay

@Composable
fun Navigation(){
    val backStack = remember{ mutableStateListOf<Any>(Login) }
    NavDisplay(
        backStack = backStack,
    ){
        key ->
        when(key){
            Login -> NavEntry(key){
                Login(onLoginSuccess = {backStack += Home})
            }

            Home -> NavEntry(key){
                Home()
            }
            else -> NavEntry(Unit){
                Text(text="Unknown")
            }
        }
    }
}