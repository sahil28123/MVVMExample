package com.app.mvvmexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.app.mvvmexample.ViewModel.HomeViewModel
import com.app.mvvmexample.ui.theme.MVVMExampleTheme
import com.app.mvvmexample.view.HomePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val HomeViewModel = ViewModelProvider(this)[HomeViewModel::class]

        setContent {
            MVVMExampleTheme {

                HomePage(HomeViewModel)

                }
            }
        }
}

