package com.godslew.navigationsample.ui.main

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

sealed class Title : Parcelable {
    abstract val name: String

    @Parcelize
    data class Game(
        override val name: String = "Game"
    ) : Title()

    @Parcelize
    data class Tv(
        override val name: String = "TV Show"
    ) : Title()

    @Parcelize
    data class Movie(
        override val name: String = "Movie"
    ) : Title()
}
