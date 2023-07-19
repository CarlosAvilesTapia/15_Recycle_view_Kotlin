package com.example.a15recycleviewkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a15recycleviewkotlin.databinding.ItemBinding

class PokemonAdapter : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {
val pokemons = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class ViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}
