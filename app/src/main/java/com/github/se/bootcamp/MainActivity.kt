package com.github.se.bootcamp

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.credentials.CredentialManager
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.github.se.bootcamp.model.todo.ToDosRepositoryLocal
import com.github.se.bootcamp.ui.map.MapScreen
import com.github.se.bootcamp.ui.navigation.NavigationActions
import com.github.se.bootcamp.ui.navigation.Screen
import com.github.se.bootcamp.ui.overview.AddTodoScreen
import com.github.se.bootcamp.ui.overview.OverviewScreen
import com.github.se.bootcamp.ui.theme.BootcampTheme
import okhttp3.OkHttpClient

/**
 * *B3 only*:
 *
 * Provide an OkHttpClient client for network requests.
 *
 * Property `client` is mutable for testing purposes.
 */
object HttpClientProvider {
  var client: OkHttpClient = OkHttpClient()
}

private val startDestination = Screen.Overview.name

/**
 * `MainActivity` is the entry point of the application. It sets up the content view with the
 * `onCreate` methods. You can run the app by running the `app` configuration in Android Studio. NB:
 * Make sure you have an Android emulator running or a physical device connected.
 */
class MainActivity : ComponentActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent { BootcampTheme { Surface(modifier = Modifier.fillMaxSize()) { BootcampApp() } } }
  }
}

/**
 * `BootcampApp` is the main composable function that sets up the whole app UI. It initializes the
 * navigation controller and defines the navigation graph. You can add your app implementation
 * inside this function.
 *
 * @param navHostController The navigation controller used for navigating between screens.
 *
 * For B3:
 *
 * @param context The context of the application, used for accessing resources and services.
 * @param credentialManager The CredentialManager instance for handling authentication credentials.
 */
@Composable
fun BootcampApp(
    navController: NavHostController = rememberNavController(),
    context: Context = LocalContext.current,
    credentialManager: CredentialManager = CredentialManager.create(context)
) {
  val localRepository = ToDosRepositoryLocal()
  val navigationActions = NavigationActions(navController)

  NavHost(navController = navController, startDestination = startDestination) {
    navigation(
        startDestination = Screen.Overview.route,
        route = Screen.Overview.name,
    ) {
      composable(Screen.Overview.route) {
        OverviewScreen(
            onAddTodo = { navigationActions.navigateTo(Screen.AddToDo) },
            onSelectTodo = { navigationActions.navigateTo(Screen.Map) },
            navigationActions = navigationActions)
      }
      composable(Screen.AddToDo.route) { AddTodoScreen(onDone = { navigationActions.goBack() }) }
    }
    navigation(
        startDestination = Screen.Map.route,
        route = Screen.Map.name,
    ) {
      composable(Screen.Map.route) { MapScreen(navigationActions = navigationActions) }
    }
  }
}
