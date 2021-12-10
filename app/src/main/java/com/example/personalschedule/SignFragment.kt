package com.example.personalschedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class SignFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        /** will identify the create button on the second page */
        val backtoLoginPage = view.findViewById<Button>(R.id.create_button)

        backtoLoginPage.setOnClickListener(

             /** after you click create it will take you back to login page */
            Navigation.createNavigateOnClickListener(R.id.starLogin_page)
        )

    }
}