package xyz.teamgravity.composefabexplosionanimation

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@Composable
fun SharedTransitionScope.ScreenB(
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
            .sharedBounds(
                sharedContentState = rememberSharedContentState(
                    key = Const.KEY_FAB_EXPLOSION_ANIMATION
                ),
                animatedVisibilityScope = animatedVisibilityScope
            )
    ) {
        Text(
            text = stringResource(R.string.screen_b)
        )
    }
}