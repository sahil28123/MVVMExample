package com.app.mvvmexample.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.mvvmexample.Model.UserData
import com.app.mvvmexample.Model.UserRepositry
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {

    val userRespositry: UserRepositry = UserRepositry()

    private val _userdata = MutableLiveData<UserData>()
    val userdata : LiveData<UserData> = _userdata

    private val _isloading = MutableLiveData<Boolean>(false)
    val isloading : LiveData<Boolean> = _isloading

    fun getUserData(){
        _isloading.postValue(true)
        viewModelScope.launch {
            val result = userRespositry.fetchUserdata()
            _userdata.postValue(result)
            _isloading.postValue(false)
        }

    }






}