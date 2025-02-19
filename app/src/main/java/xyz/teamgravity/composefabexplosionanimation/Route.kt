package xyz.teamgravity.composefabexplosionanimation

import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object ScreenA : Route

    @Serializable
    data object ScreenB : Route
}