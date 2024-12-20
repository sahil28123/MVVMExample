package com.app.mvvmexample.Model

import kotlinx.coroutines.delay

class UserRepositry {

    suspend fun fetchUserdata(): UserData{

        //Mock api
        delay(2000)
        return UserData("Sahil",21)

    }
}