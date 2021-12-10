package com.example.personalschedule

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

          /** this will identify the sign button */
        val signupClicked = view.findViewById<Button>(R.id.signup_button)

        signupClicked.setOnClickListener(

            /** When we click on sign up it will open a new Fragment which is sign up */
            Navigation.createNavigateOnClickListener(R.id.login_id_action)
        )

        /** for login button */
        val loginClicked = view.findViewById<Button>(R.id.login_button)

        loginClicked.setOnClickListener(

            /** when you log in it will take you to the event created page */
            Navigation.createNavigateOnClickListener(R.id.signUp_id_action)
        )
      }
   }



