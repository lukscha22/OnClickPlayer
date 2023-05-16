package com.example.thelastoneihope

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentAnimalSounds : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    val view= inflater.inflate(R.layout.fragment_animal_sounds,container,false)
    val buttonBack = view?.findViewById<Button>(R.id.BackButton)

        val animalButton1 =view?.findViewById<Button>(R.id.AnimalButton1)
        val animalButton2 =view?.findViewById<Button>(R.id.AnimalButton2)
        val animalButton3 =view?.findViewById<Button>(R.id.AnimalButton3)
        val animalButton4 =view?.findViewById<Button>(R.id.AnimalButton4)
        val animalButton5 =view?.findViewById<Button>(R.id.AnimalButton5)
        val animalButton6 =view?.findViewById<Button>(R.id.AnimalButton6)

    buttonBack?.setOnClickListener {
        parentFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, MainFragment()).commit()
        }
    }

        animalButton1?.setOnClickListener {
            playSound(R.raw.cat_sound)
        }

        animalButton2?.setOnClickListener {
            playSound(R.raw.dog_sound)
        }

        animalButton3?.setOnClickListener {
            playSound(R.raw.horse_whine)
        }

        animalButton4?.setOnClickListener {
            playSound(R.raw.sheep_sound)
        }

        animalButton5?.setOnClickListener {
            playSound(R.raw.elephant)
        }

        animalButton6?.setOnClickListener {
            playSound(R.raw.cow_sound)
        }
    return view
    }
    private fun playSound(soundId: Int) {
        val mediaPlayer = MediaPlayer.create(requireContext(), soundId)
        mediaPlayer.start()
        mediaPlayer.setOnCompletionListener {
            mediaPlayer.release()
        }
    }
}