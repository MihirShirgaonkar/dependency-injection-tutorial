package com.mihir.dagger2.day_2.entities

import android.util.Log
import javax.inject.Inject

interface NotificarionService2 {
    fun send( string: String)
}

class MessageService @Inject constructor(private val retryCount : Int) : NotificarionService2 {
    override fun send(string: String) {
        Log.d("MyTag","Message - $string retry count - $retryCount")
    }
}


class EmailService() : NotificarionService2 {
    override fun send(string: String) {
        Log.d("MyTag","Message - $string")
    }
}