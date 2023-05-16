package com.example.thelastoneihope

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment


class MainFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val buttonFunny = view.findViewById<Button>(R.id.FunnyButton)
        val buttonAnimal = view.findViewById<Button>(R.id.AnimalButton)
        val buttonRandom = view.findViewById<Button>(R.id.AmbienceButton)
        val buttonSurprise = view.findViewById<Button>(R.id.SurpriseButton)
        val buttonRecycler = view.findViewById<Button>(R.id.RecyclerButton)

        buttonFunny.setOnClickListener {
            switchFrags(FragmentFunnySounds())
        }

        buttonAnimal.setOnClickListener {
            switchFrags(FragmentAnimalSounds())
        }

        buttonRandom.setOnClickListener {
            switchFrags(FragmentAmbienceSounds())
        }

        buttonRecycler.setOnClickListener {
            switchFrags(RecyclerFragment())
        }

        buttonSurprise.setOnClickListener {
            Toast.makeText(activity, "You have been rick-rolled!", Toast.LENGTH_SHORT).show()
            val mediaPlayer = MediaPlayer.create(requireContext(), R.raw.rick_roll)
            mediaPlayer.start()
        }

        return view
    }

    private fun switchFrags(fragment: Fragment){
        parentFragmentManager.beginTransaction().apply{
            replace(R.id.fragmentContainerView,fragment).commit()
        }
    }


}



