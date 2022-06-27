package com.mihir.dagger2.day_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mihir.dagger2.R
import com.mihir.dagger2.day_1.dagger.DaggerUserRegistrationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

//    @Inject
//    lateinit var sendEmail : EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)

        userRegistrationService.registerUserRepo("asad@gmail.com","123312")
//
//        sendEmail.sendEmail("email sent!!!!!!!!!")
    }
}