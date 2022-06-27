package com.mihir.dagger2.day_1.enities

import android.util.Log
import javax.inject.Inject



interface UserRepsitory {
    fun registerUser(email: String,pass : String)
}

class SQLDatabase @Inject constructor() : UserRepsitory {
    override fun registerUser(email: String, pass : String){
        Log.d("TAG","User Registered to SQL Database")
    }
}

class FirebaseService : UserRepsitory {
    override fun registerUser(email: String, pass: String) {
        Log.d("TAG","User Registered to Firebase")
    }

}