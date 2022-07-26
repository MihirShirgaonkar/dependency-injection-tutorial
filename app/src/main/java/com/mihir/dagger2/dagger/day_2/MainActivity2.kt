package com.mihir.dagger2.dagger.day_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.mihir.dagger2.R
import com.mihir.dagger2.dagger.UserApplication
import com.mihir.dagger2.day_2.component.AnalyticsService
import com.mihir.dagger2.dagger.day_2.entities.EmailService
import com.mihir.dagger2.dagger.day_2.entities.UserRegestrationService
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var userRegestrationService: UserRegestrationService

    @Inject
    lateinit var messageService: EmailService
    @Inject
    lateinit var messageService2: EmailService

    @Inject
    lateinit var mixpanel: AnalyticsService

    @Inject
    lateinit var mixpanel2: AnalyticsService



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val et = findViewById<EditText>(R.id.et)
        val btn = findViewById<Button>(R.id.button)



            val appcomponent = (application as UserApplication).appComponent

        val component =appcomponent.getMainActivityComponent()
            .retrycount1(1)
            .retrycount2(2)
            .build()
            component.inject(this)


                userRegestrationService.registerUser("Mihir","shirgaonkarmihir14@gmail.com","hello.... mihir here")



    }
}