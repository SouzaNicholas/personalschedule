package com.example.personalschedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class FirstNameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_name, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        /** get the add to Schedule ID */

        val addToSchedule = view.findViewById<Button>(R.id.add_to_schedule_button)

        addToSchedule.setOnClickListener(

            /** take to the last page which is New event */
            Navigation.createNavigateOnClickListener(R.id.New_event_page)
        )

      val logOutButton = view.findViewById<Button>(R.id.log_out_button)

        logOutButton.setOnClickListener(

            Navigation.createNavigateOnClickListener(R.id.starLogin_page)
        )

    }
}