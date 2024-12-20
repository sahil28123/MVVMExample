package com.app.mvvmexample.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.app.mvvmexample.ViewModel.HomeViewModel

@Composable
fun HomePage(viewModel: HomeViewModel){

    val userData = viewModel.userdata.observeAsState()
    val isloading = viewModel.isloading.observeAsState()

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(onClick = {
            viewModel.getUserData()
        }) {
            Text(text="Get User Data")
        }

        if(isloading.value == true){
            CircularProgressIndicator()
        }else{
            userData.value?.name?.let {
                Text(text = "Name $it")
            }

            userData.value?.age?.let {
                Text(text = "Name $it")
            }

        }


    }
}