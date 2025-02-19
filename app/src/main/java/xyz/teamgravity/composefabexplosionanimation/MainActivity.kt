package xyz.teamgravity.composefabexplosionanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import xyz.teamgravity.composefabexplosionanimation.ui.theme.ComposeFABExplosionAnimationTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeFABExplosionAnimationTheme {
                val controller = rememberNavController()

                SharedTransitionLayout {
                    NavHost(
                        navController = controller,
                        startDestination = Route.ScreenA,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        composable<Route.ScreenA> {
                            ScreenA(
                                animatedVisibilityScope = this,
                                onNavigateToScreenB = {
                                    controller.navigate(Route.ScreenB)
                                }
                            )
                        }
                        composable<Route.ScreenB> {
                            ScreenB(
                                animatedVisibilityScope = this
                            )
                        }
                    }
                }
            }
        }
    }
}