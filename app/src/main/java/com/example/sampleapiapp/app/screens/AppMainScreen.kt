package com.example.sampleapiapp.app.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.sampleapiapp.app.ui.theme.AppTheme

@Composable
fun AppMainScreen() {
    AppTheme {
        Scaffold(bottomBar = {
            BottomAppBar() {

            }
        },
            topBar = {
                Row(Modifier.padding()) {
                    Text(text = "Helo")
                }
            }
        ) {

        }
    }
}