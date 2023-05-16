package com.example.thelastoneihope

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MyAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recycler, container, false)
        val buttonBack = view?.findViewById<Button>(R.id.BackButton)
        recyclerView = view.findViewById(R.id.recycler_view)

        buttonBack?.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, MainFragment()).commit()
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = MyAdapter(listOf("Arnold", "Asteroids", "Birds", "Cat", "Cow", "Damn son", "Dog", "Elephant", "Fire", "Gnome", "Horse", "Jeff", "Pigeons" , "Rain" , "Sheep", "Thunder" , "Yoshi", "Kenny"))
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)


    }
}
