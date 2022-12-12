package com.ostapenko.android.testtaskkitstore.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.ostapenko.android.testtaskkitstore.R

class GameFragment : Fragment(R.layout.fragment_game) {

    private lateinit var view1: Button
    private lateinit var view2: Button
    private lateinit var view3: Button
    private lateinit var view4: Button
    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view1 = view.findViewById(R.id.view1)
        view2 = view.findViewById(R.id.view2)
        view3 = view.findViewById(R.id.view3)
        view4 = view.findViewById(R.id.view4)
        textView = view.findViewById(R.id.text_view)

        view1.setOnClickListener {

            view1.background =
                ResourcesCompat.getDrawable(resources, R.drawable.background_orange, null)
            view3.background =
                ResourcesCompat.getDrawable(resources, R.drawable.background_green, null)
            view4.background =
                ResourcesCompat.getDrawable(resources, R.drawable.background_green, null)

            checkIfAllGreen()
        }

        view2.setOnClickListener {

            view2.background =
                ResourcesCompat.getDrawable(resources, R.drawable.background_green, null)
            view1.background =
                ResourcesCompat.getDrawable(resources, R.drawable.background_green, null)

            checkIfAllGreen()
        }

        view3.setOnClickListener {

            view3.background =
                ResourcesCompat.getDrawable(resources, R.drawable.background_green, null)

            view2.background =
                ResourcesCompat.getDrawable(resources, R.drawable.background_orange, null)

            checkIfAllGreen()
        }
    }

    private fun checkIfAllGreen() {
        var result = ""
        if (view1.background.constantState == ResourcesCompat.getDrawable(
                resources,
                R.drawable.background_green,
                null
            )?.constantState
        ) {
            if (view2.background.constantState == ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.background_green,
                    null
                )?.constantState
            ) {
                if (view3.background.constantState == ResourcesCompat.getDrawable(
                        resources,
                        R.drawable.background_green,
                        null
                    )?.constantState
                ) {
                    if (view4.background.constantState == ResourcesCompat.getDrawable(
                            resources,
                            R.drawable.background_green,
                            null
                        )?.constantState
                    ) {
                        result = "OK"
                    }
                }
            }
        }

        if (result == "OK") {
            textView.text = "Greetings, all green"
        }
    }

}