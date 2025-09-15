package com.github.se.bootcamp.ui.authentication

import androidx.compose.runtime.Composable

object SignInScreenTestTags {
  const val APP_LOGO = "appLogo"
  const val LOGIN_TITLE = "loginTitle"
  const val LOGIN_BUTTON = "loginButton"
}

@Composable
fun SignInScreen(
    /**
     * You can add parameters with default values here, e.g., onClick: () -> Unit = {}, modifier:
     * Modifier = Modifier, credentialManager: CredentialManager =
     * CredentialManager.create(LocalContext.current)
     *
     * Note: Parameters with default values do not mean that you should use the default value in
     * your implementation. They ensure that we can still use your code in our tests.
     */
) {}
