package com.timife.foodies.common.data.api.model.mappers

/**
 * Created by Timothy Ifeoluwa on 25/02/22
 */

interface RecipeApiMapper<E, D> {
    fun mapToDomain(apiEntity: E): D
}