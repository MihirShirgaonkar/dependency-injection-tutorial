package com.mihir.dagger2.day_2.entities

import android.util.Log
import com.mihir.dagger2.day_2.component.AnalyticsService
import javax.inject.Inject

interface UserDetailService {
    fun saveUser(name: String,email : String)
}


class SQLDatabase @Inject() constructor(val analyticsService: AnalyticsService) : UserDetailService {
    override fun saveUser(name: String, email: String) {
        Log.d("MyTag", "saveUser: user saved to SQL Database")
        analyticsService.trackEvent("save user","create")
    }
}

class FirebaseDatabase (val analyticsService: AnalyticsService): UserDetailService {
    override fun saveUser(name: String, email: String) {
        Log.d("MyTag", "saveUser: user saved to Firebase")
        analyticsService.trackEvent("save user","create")

    }
}
