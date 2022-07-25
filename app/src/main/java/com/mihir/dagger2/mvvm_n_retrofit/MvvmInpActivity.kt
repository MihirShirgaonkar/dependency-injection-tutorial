package com.mihir.dagger2.mvvm_n_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mihir.dagger2.R
import com.mihir.dagger2.UserApplication
import com.mihir.dagger2.mvvm_n_retrofit.viewModels.ProductViewModel
import com.mihir.dagger2.mvvm_n_retrofit.viewModels.ProductViewModelFactory
import javax.inject.Inject

class MvvmInpActivity : AppCompatActivity() {

    lateinit var viewModel  : ProductViewModel

    @Inject
    lateinit var productViewModelFactory: ProductViewModelFactory

//    @Inject
//    lateinit var map: Map<Class<*>,ViewModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm_inp)


        val component = (application as UserApplication).fakerComponent
            component.inject(this)

       val cls =  component.getMap()



//        get(ProductViewModel::class.java)
        viewModel = ViewModelProvider(this,productViewModelFactory).get(ProductViewModel::class.java)

        val textView = findViewById<TextView>(R.id.text)

        viewModel.productsList.observe(this, Observer {

            textView.text = it.joinToString { i ->
                i.title + "\n\n"
            }

        })
    }
}