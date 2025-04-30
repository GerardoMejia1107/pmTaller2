package com.pdmtaller2.a0104923_GerardoMejia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
                val bottomBarColor = Color(0xFF75A47F)
                val iconsButtomBarColor = Color(0xFFFCFFE0)
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomAppBar(
                            containerColor = bottomBarColor,
                            contentColor = bottomBarColor,
                        ) {
                            NavigationBar(
                                containerColor = bottomBarColor
                            ) {
                                Row {
                                    NavigationBarItem(
                                        icon = {
                                            Icon(
                                                imageVector = Icons.Filled.List,
                                                contentDescription
                                                = "",
                                                tint = iconsButtomBarColor
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
                                                = "",
                                                tint = iconsButtomBarColor
                                            )
                                        },
                                        selected = false,
                                        onClick = { navController.navigate(Screen.SearchScreen.route) }
                                    )

                                    NavigationBarItem(
                                        icon = {
                                            Icon(
                                                imageVector = Icons.Filled.AccountBox,
                                                contentDescription
                                                = "",
                                                tint = iconsButtomBarColor
                                            )
                                        },
                                        selected = false,
                                        onClick = { navController.navigate(Screen.OrdersScreen.route) }
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



