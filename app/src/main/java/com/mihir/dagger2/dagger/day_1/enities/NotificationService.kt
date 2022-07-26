package com.mihir.dagger2.dagger.day_1.enities

import android.util.Log
import javax.inject.Inject


interface NotificationService{
    fun send( string : String)
}

class EmailService @Inject constructor() : NotificationService {

    override fun send(string : String){
        Log.d("TAG","Email : ${string}")
    }
}


class MessageService(private val count : Int) : NotificationService {
    override fun send(string: String) {
        Log.d("TAG","Message Sent : ${string} retry count $count")

    }

}