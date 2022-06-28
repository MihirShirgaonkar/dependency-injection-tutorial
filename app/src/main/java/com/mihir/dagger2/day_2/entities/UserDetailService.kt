package com.mihir.dagger2.day_2.entities

import android.util.Log
import javax.inject.Inject

interface UserDetailService {
    fun saveUser(name: String,email : String)
}


class SQLDatabase @Inject() constructor() : UserDetailService {
    override fun saveUser(name: String, email: String) {
        Log.d("MyTag", "saveUser: user saved to SQL Database")
    }
}

class FirebaseDatabase (): UserDetailService {
    override fun saveUser(name: String, email: String) {
        Log.d("MyTag", "saveUser: user saved to Firebase")
    }
}
