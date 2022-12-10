package com.ostapenko.android.testtaskkitstore.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.ostapenko.android.testtaskkitstore.R


class HomeFragment : Fragment() {

    private lateinit var playButton: Button
    private lateinit var editName: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        playButton = view.findViewById(R.id.play_button)
        editName = view.findViewById(R.id.edit_name)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        playButton.setOnClickListener { currentView ->

            val name = editName.text.toString().lowercase()

            if (name.isEmpty()) {
                Toast.makeText(
                    requireContext(),
                    "You must enter your name to start play",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                if (name.contains("mod") || name.contains("bot")) {
                    currentView.findNavController().navigate(R.id.action_homeFragment_to_gameFragment)
                } else {
                    currentView.findNavController().navigate(R.id.action_homeFragment_to_webViewFragment)
                }
            }
        }
    }
}