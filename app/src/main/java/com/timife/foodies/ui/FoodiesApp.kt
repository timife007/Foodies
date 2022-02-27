package com.timife.foodies.ui


import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.timife.foodies.FoodiesTabs
import com.timife.foodies.ui.theme.FoodiesTheme

/**
 * Created by Timothy Ifeoluwa on 23/02/22
 */

@Composable
fun FoodiesApp() {
    FoodiesTheme {
        val navController = rememberNavController()
        val tabs = remember{FoodiesTabs.values()}
        androidx.compose.material.Scaffold(
            backgroundColor = MaterialTheme.colors.primarySurface,
            bottomBar = { FoodiesBottomBar(navController, tabs) }
        ) {
            NavGraph()
        }
    }
}

@Composable
fun FoodiesBottomBar(navController: NavHostController, tabs: Array<FoodiesTabs>) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: FoodiesTabs.HOME_TAB

    val routes = remember { FoodiesTabs.values().map { it.route } }
    if(currentRoute in routes){
        BottomNavigation(
           backgroundColor = Color.White
        ) {
            tabs.forEach { tab ->
//                BottomNavigationItem(selected = , onClick = { /*TODO*/ }) {
//
//                }

            }

        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FoodiesTheme {
    }
}

