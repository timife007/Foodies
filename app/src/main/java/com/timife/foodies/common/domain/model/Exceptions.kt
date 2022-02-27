package com.timife.foodies.common.domain.model

import java.io.IOException

/**
 * Created by Timothy Ifeoluwa on 25/02/22
 */

class NetworkUnavailableException(message: String = "No network available :(") : IOException(message)

class NetworkException(message: String): Exception(message)

class NoMoreRecipesException(message: String): Exception(message)