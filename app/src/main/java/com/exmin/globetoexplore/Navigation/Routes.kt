package com.exmin.globetoexplore.Navigation

import kotlinx.serialization.Serializable

sealed class Routes {
   @Serializable
   data object representation:Routes()

        @Serializable
        data object WelcomeScreen:Routes()
    @Serializable
    data object UserRegistrationScreen:Routes()
    @Serializable
    data object Homescreen:Routes()
    @Serializable
    data object Updatescreen:Routes()
    @Serializable
    data object Communitescreen:Routes()
    @Serializable
    data object Callscreen:Routes()
    @Serializable
    data object Chatdesign:Routes()


}