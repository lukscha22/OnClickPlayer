package com.example.thelastoneihope

import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val data: List<String>) : RecyclerView.Adapter<MyViewHolder>() {

    private val soundMap = mapOf(
        "Arnold" to R.raw.arnold,
        "Asteroids" to R.raw.asteroids,
        "Birds" to R.raw.birds,
        "Cat" to R.raw.cat_sound,
        "Cow" to R.raw.cow_sound,
        "Damn son" to R.raw.damn_son,
        "Dog" to R.raw.dog_sound,
        "Elephant" to R.raw.elephant,
        "Fire" to R.raw.fire,
        "Gnome" to R.raw.gnome,
        "Horse" to R.raw.horse_whine,
        "Jeff" to R.raw.my_name_jeff,
        "Pigeons" to R.raw.pigeon,
        "Rain" to R.raw.rain,
        "Sheep" to R.raw.sheep_sound,
        "Thunder" to R.raw.thunder,
        "Yoshi" to R.raw.yoshi,
        "Kenny" to R.raw.you_killed_kenny,
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val soundName = data[position]
        holder.textView.text = soundName
        holder.button.setOnClickListener {
            val mediaPlayer = MediaPlayer.create(holder.itemView.context, soundMap[soundName] ?: return@setOnClickListener)
            mediaPlayer.start()
        }
    }
}
