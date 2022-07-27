package com.mihir.dagger2.Hilt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mihir.dagger2.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltBlankFragment : Fragment() {

    @Inject
    lateinit var userRepo: UserRepo

    @Inject
    lateinit var notificationService2: NotificationService2


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val v :View = inflater.inflate(R.layout.fragment_hilt_blank, container, false)
        userRepo.saveData("Myhelloooooooooo")

        notificationService2.send("Myyyyyyyyyyyyyyyyyyy")


        return v



    }


}