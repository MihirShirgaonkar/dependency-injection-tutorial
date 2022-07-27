package com.mihir.dagger2.Hilt

import android.content.Context
import android.util.Log
import android.widget.Toast
import javax.inject.Inject

const val TAG = "MyTag"
class UserRepo @Inject constructor() {


    fun saveData(context: String){
        Log.d(TAG, "saveData: $context")
//        Toast.makeText(context,"Hello WOrld",Toast.LENGTH_LONG).show()
    }
}