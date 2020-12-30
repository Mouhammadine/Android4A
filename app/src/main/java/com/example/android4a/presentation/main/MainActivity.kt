package com.example.android4a.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android4a.R
import org.koin.android.ext.android.inject
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button.setOnClickListener {
            mainViewModel.onClickedIncrement("")
        }


    }
}