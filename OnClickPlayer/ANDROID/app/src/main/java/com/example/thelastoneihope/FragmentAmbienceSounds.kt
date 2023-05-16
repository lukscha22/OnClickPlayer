package com.example.thelastoneihope

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentAmbienceSounds : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater?.inflate(R.layout.fragment_ambience_sounds,container,false)
        val buttonBack = view?.findViewById<Button>(R.id.BackButton)

        val ambienceButton1 =view?.findViewById<Button>(R.id.AmbienceButton1)
        val ambienceButton2 =view?.findViewById<Button>(R.id.AmbienceButton2)
        val ambienceButton3 =view?.findViewById<Button>(R.id.AmbienceButton3)
        val ambienceButton4 =view?.findViewById<Button>(R.id.AmbienceButton4)
        val ambienceButton5 =view?.findViewById<Button>(R.id.AmbienceButton5)
        val ambienceButton6 =view?.findViewById<Button>(R.id.AmbienceButton6)

        buttonBack?.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, MainFragment()).commit()
            }
        }

        ambienceButton1?.setOnClickListener {
            playSound(R.raw.fire)
        }

        ambienceButton2?.setOnClickListener {
            playSound(R.raw.asteroids)
        }

        ambienceButton3?.setOnClickListener {
            playSound(R.raw.rain)
        }

        ambienceButton4?.setOnClickListener {
            playSound(R.raw.thunder)
        }

        ambienceButton5?.setOnClickListener {
            playSound(R.raw.birds)
        }

        ambienceButton6?.setOnClickListener {
            playSound(R.raw.pigeon)
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