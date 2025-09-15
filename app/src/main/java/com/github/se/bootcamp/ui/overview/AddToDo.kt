package com.github.se.bootcamp.ui.overview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import com.github.se.bootcamp.ui.navigation.NavigationTestTags
import com.github.se.bootcamp.ui.navigation.Screen

object AddToDoScreenTestTags {
  const val INPUT_TODO_TITLE = "inputTodoTitle"
  const val INPUT_TODO_DESCRIPTION = "inputTodoDescription"
  const val INPUT_TODO_ASSIGNEE = "inputTodoAssignee"
  const val INPUT_TODO_LOCATION = "inputTodoLocation"
  const val LOCATION_SUGGESTION = "locationSuggestion"
  const val INPUT_TODO_DATE = "inputTodoDate"
  const val TODO_SAVE = "todoSave"
  const val ERROR_MESSAGE = "errorMessage"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddTodoScreen(
    onDone: () -> Unit = {},
) {
  Scaffold(
      topBar = {
        TopAppBar(
            title = {
              Text(Screen.AddToDo.name, Modifier.testTag(NavigationTestTags.TOP_BAR_TITLE))
            },
            navigationIcon = {
              IconButton(
                  onClick = { onDone() }, Modifier.testTag(NavigationTestTags.GO_BACK_BUTTON)) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                        contentDescription = "Back")
                  }
            })
      },
      content = { paddingValues ->
        Column(modifier = Modifier.fillMaxSize().padding(paddingValues)) {

          // Fields for ToDo details

        }
      })
}
