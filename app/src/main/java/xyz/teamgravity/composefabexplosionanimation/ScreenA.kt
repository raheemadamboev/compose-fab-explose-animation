package xyz.teamgravity.composefabexplosionanimation

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun SharedTransitionScope.ScreenA(
    animatedVisibilityScope: AnimatedVisibilityScope,
    onNavigateToScreenB: () -> Unit
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = onNavigateToScreenB,
                containerColor = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .sharedBounds(
                        sharedContentState = rememberSharedContentState(
                            key = Const.KEY_FAB_EXPLOSION_ANIMATION
                        ),
                        animatedVisibilityScope = animatedVisibilityScope
                    )
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
            }
        }
    ) { padding ->
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            Text(
                text = stringResource(R.string.screen_a)
            )
        }
    }
}