package com.github.se.bootcamp.ui.overview

import androidx.compose.runtime.Composable

object EditToDoScreenTestTags {
  const val INPUT_TODO_TITLE = "inputTodoTitle"
  const val INPUT_TODO_DESCRIPTION = "inputTodoDescription"
  const val INPUT_TODO_ASSIGNEE = "inputTodoAssignee"
  const val INPUT_TODO_LOCATION = "inputTodoLocation"
  const val LOCATION_SUGGESTION = "locationSuggestion"
  const val INPUT_TODO_DATE = "inputTodoDate"
  const val INPUT_TODO_STATUS = "inputTodoStatus"
  const val TODO_SAVE = "todoSave"
  const val TODO_DELETE = "todoDelete"
  const val ERROR_MESSAGE = "errorMessage"
}

@Composable
fun EditToDoScreen(
    todoUid: String,
    /**
     * You can add parameters with default values here, e.g., onClick: () -> Unit = {}, modifier:
     * Modifier = Modifier, navController: NavHostController = rememberNavController(),
     *
     * Note: Parameters with default values do not mean that you should use the default value in
     * your implementation. They ensure that we can still use your code in our tests.
     */
) {}
