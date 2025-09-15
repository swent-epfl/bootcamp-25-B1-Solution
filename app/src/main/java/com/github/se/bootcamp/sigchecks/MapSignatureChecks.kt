package com.github.se.bootcamp.sigchecks

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import kotlin.properties.Delegates

class MapSignatureChecks private constructor() {

  @Composable
  @SuppressLint("ComposableNaming")
  fun checkAddAndEditScreens() {
    // AddToDoScreen and EditToDoScreen should take a LocationViewModel as parameter.
    // To avoid issues with the previous Signature Checks, it must be optional (i.e. have a default
    // value).

    com.github.se.bootcamp.ui.overview.EditToDoScreen(todoUid)
  }

  // String used to query the repository
  private var string by Delegates.notNull<String>()

  private var locationList by Delegates.notNull<List<com.github.se.bootcamp.model.map.Location>>()

  private var onSuccess by
      Delegates.notNull<(List<com.github.se.bootcamp.model.map.Location>) -> Unit>()

  private var onFailure by Delegates.notNull<(Exception) -> Unit>()

  private var todoUid by Delegates.notNull<String>()
}
