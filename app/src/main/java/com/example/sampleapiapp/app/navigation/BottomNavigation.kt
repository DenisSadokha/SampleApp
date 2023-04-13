package com.example.sampleapiapp.app.navigation

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.example.sampleapiapp.R

enum class BottomBarMenu(val route: String, @StringRes val resourceId: Int) {
    Details("details", R.string.details),
    Feed("feed", R.string.feed)
}

@Composable
fun BottomBar(navController: NavController) {

    NavigationBar() {

        BottomBarMenu.values().forEach {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                NavigationBarItem(
                    icon = { Icon(Icons.Filled.Favorite, contentDescription = "") },
                    label = { Text(stringResource(it.resourceId)) },
                    selected = false,
                    onClick = { }
                )

            }
        }
    }

}