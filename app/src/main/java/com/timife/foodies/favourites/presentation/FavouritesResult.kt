package com.timife.foodies.favourites.presentation

/**
 * Created by timife on 27/02/2022
 */

sealed class FavouritesResult <out R> {

    data class Success<out T>(val data: T?) : FavouritesResult<T>()
    data class Error(val exception: Exception) : FavouritesResult<Nothing>()
    object Loading : FavouritesResult<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
            is Loading -> "Loading"
        }
    }
}