package com.mihir.dagger2.Hilt

import android.util.Log
import javax.inject.Inject


interface NotificationService2{
    fun send( string : String)
}

class EmailService2 @Inject constructor() : NotificationService2 {

    override fun send(string : String){
        Log.d("TAG","Email : ${string}")
    }
}


class MessageService2  : NotificationService2 {
    override fun send(string: String) {
        Log.d("TAG","Message Sent : ${string} retry count ")

    }

}