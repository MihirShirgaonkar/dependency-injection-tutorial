package com.mihir.dagger2.day_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.mihir.dagger2.R
import com.mihir.dagger2.day_2.component.DaggerMainActivityComponent
import com.mihir.dagger2.day_2.component.MainActivityComponent
import com.mihir.dagger2.day_2.entities.UserRegestrationService
import com.mihir.dagger2.day_2.modules.NotificationModule
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var userRegestrationService: UserRegestrationService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val et = findViewById<EditText>(R.id.et)
        val btn = findViewById<Button>(R.id.button)



        btn.setOnClickListener{
            val component = DaggerMainActivityComponent.factory().create(et.text.toString().toInt())
            component.inject(this)

            userRegestrationService.registerUser("Mihir","shirgaonkarmihir14@gmail.com","hello.... mihir here")

        }

    }
}