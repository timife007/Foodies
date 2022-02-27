package com.timife.foodies.recipe.presentation

/**
 * Created by timife on 27/02/2022
 */

sealed class RecipeResult<out R> {

    data class Success<out T>(val data: T?) : RecipeResult<T>()
    data class Error(val exception: Exception) : RecipeResult<Nothing>()
    object Loading : RecipeResult<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
            is Loading -> "Loading"
        }
    }
}
