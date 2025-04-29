package com.pdmtaller2.a0104923_GerardoMejia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.a0104923_GerardoMejia.ui.navigation.AppNavigation
import com.pdmtaller2.a0104923_GerardoMejia.ui.navigation.Screen
import com.pdmtaller2.a0104923_GerardoMejia.ui.theme.FoodSpotByGMejíaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByGMejíaTheme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomAppBar {
                            NavigationBar {
                                Row {
                                    NavigationBarItem(
                                        icon = {
                                            Icon(
                                                imageVector = Icons.Filled.List,
                                                contentDescription
                                                = ""
                                            )
                                        },
                                        selected = false,
                                        onClick = { navController.navigate(Screen.ListsScreen.route) }
                                    )

                                    NavigationBarItem(
                                        icon = {
                                            Icon(
                                                imageVector = Icons.Filled.Search,
                                                contentDescription
                                                = ""
                                            )
                                        },
                                        selected = false,
                                        onClick = {navController.navigate(Screen.SearchScreen.route) }
                                    )

                                    NavigationBarItem(
                                        icon = {
                                            Icon(
                                                imageVector = Icons.Filled.AccountBox,
                                                contentDescription
                                                = ""
                                            )
                                        },
                                        selected = false,
                                        onClick = {navController.navigate(Screen.OrdersScreen.route) }
                                    )
                                }
                            }
                        }
                    }

                ) { innerPadding ->
                    AppNavigation(navController)
                }
            }
        }
    }
}



