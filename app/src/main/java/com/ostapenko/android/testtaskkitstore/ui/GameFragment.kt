package com.ostapenko.android.testtaskkitstore.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.ostapenko.android.testtaskkitstore.R

class GameFragment : Fragment(R.layout.fragment_game) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val view1: Button = view.findViewById(R.id.view1)
        val view2: Button = view.findViewById(R.id.view2)
        val view3: Button = view.findViewById(R.id.view3)
        val view4: Button = view.findViewById(R.id.view4)

        view1.setOnClickListener {
            view1.background.setTint(resources.getColor(R.color.colorAccent,null))
            view3.background.setTint(resources.getColor(R.color.colorAccent,null))
            view4.background.setTint(resources.getColor(R.color.baseGreen,null))

        }
        view2.setOnClickListener {
            view2.background.setTint(resources.getColor(R.color.baseGreen,null))
            view1.background.setTint(resources.getColor(R.color.baseGreen,null))

        }
        view3.setOnClickListener {
            view3.background.setTint(resources.getColor(R.color.baseGreen,null))
            view2.background.setTint(resources.getColor(R.color.colorAccent,null))
        }
    }

}