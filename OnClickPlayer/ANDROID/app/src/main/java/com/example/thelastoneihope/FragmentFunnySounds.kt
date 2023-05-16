package com.example.thelastoneihope

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FragmentFunnySounds : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater?.inflate(R.layout.fragment_funny_sounds,container,false)
        val buttonBack = view?.findViewById<Button>(R.id.BackButton)

        val funnyButton1 =view?.findViewById<Button>(R.id.FunnyButton1)
        val funnyButton2 =view?.findViewById<Button>(R.id.FunnyButton2)
        val funnyButton3 =view?.findViewById<Button>(R.id.FunnyButton3)
        val funnyButton4 =view?.findViewById<Button>(R.id.FunnyButton4)
        val funnyButton5 =view?.findViewById<Button>(R.id.FunnyButton5)
        val funnyButton6 =view?.findViewById<Button>(R.id.FunnyButton6)

        buttonBack?.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, MainFragment()).commit()
            }
        }

        funnyButton1?.setOnClickListener {
            playSound(R.raw.my_name_jeff)
        }

        funnyButton2?.setOnClickListener {
            playSound(R.raw.arnold)
        }

        funnyButton3?.setOnClickListener {
            playSound(R.raw.you_killed_kenny)
        }

        funnyButton4?.setOnClickListener {
            playSound(R.raw.gnome)
        }

        funnyButton5?.setOnClickListener {
            playSound(R.raw.yoshi)
        }

        funnyButton6?.setOnClickListener {
            playSound(R.raw.damn_son)
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