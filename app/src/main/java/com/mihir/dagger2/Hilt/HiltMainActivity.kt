package com.mihir.dagger2.Hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mihir.dagger2.R
import com.mihir.dagger2.dagger.day_1.enities.MessageService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltMainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var messageService: MessageService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_main)


//        messageService.send("afdsafasdf")


    }
}