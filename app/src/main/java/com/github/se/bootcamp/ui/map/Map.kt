package com.github.se.bootcamp.ui.map

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.github.se.bootcamp.ui.navigation.BottomNavigationMenu
import com.github.se.bootcamp.ui.navigation.NavigationActions
import com.github.se.bootcamp.ui.navigation.NavigationTestTags
import com.github.se.bootcamp.ui.navigation.Tab

object MapScreenTestTags {
  const val GOOGLE_MAP_SCREEN = "mapScreen"

  fun getTestTagForTodoMarker(todoId: String): String = "todoMarker_$todoId"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MapScreen(
    navigationActions: NavigationActions? = null,
) {
  Scaffold(
      topBar = {
        TopAppBar(
            title = { Text("Map", modifier = Modifier.testTag(NavigationTestTags.TOP_BAR_TITLE)) },
            actions = {})
      },
      bottomBar = {
        BottomNavigationMenu(
            selectedTab = Tab.Map,
            onTabSelected = { tab -> navigationActions?.navigateTo(tab.destination) },
            modifier = Modifier.testTag(NavigationTestTags.BOTTOM_NAVIGATION_MENU))
      },
      content = { padding ->
        Text(
            "Map Screen",
            modifier = Modifier.padding(padding).testTag(MapScreenTestTags.GOOGLE_MAP_SCREEN))
      })
}
