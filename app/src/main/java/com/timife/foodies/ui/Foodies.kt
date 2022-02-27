package com.timife.foodies.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.timife.foodies.R

enum class FoodiesTabs(val route:String, @StringRes title:Int, @DrawableRes val icon :Int){
    HOME_TAB(FoodiesDestinations.HOME_ROUTE, R.string.home,R.drawable.ic_grain),
    FAVOURITES_TAB(FoodiesDestinations.FAVOURITES_ROUTE,R.string.favourite,R.drawable.ic_favourite)
}

private object FoodiesDestinations{
    const val HOME_ROUTE = "foodies/home"
    const val FAVOURITES_ROUTE = "foodies/favourites"
}