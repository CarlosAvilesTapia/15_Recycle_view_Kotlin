package com.example.a15recycleviewkotlin

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a15recycleviewkotlin.databinding.ItemBinding

// Se declara la clase Adapter heredando de RecyclerView.Adapter.
class PokemonAdapter : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {
    var pokemons = mutableListOf<Pokemon>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = pokemons[position]
        holder.bind(item)

        // Aplicación de la animación creada en la carpeta res.
        holder.binding.cvPokemonCard.startAnimation(
            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.anim_cv)
        )
    }

    // Creación de la función para llenado de datos
    fun setData(pokedex: List<Pokemon>) {
        this.pokemons = pokedex.toMutableList()
    }

    // Se implementa la función bind con todos los views del card view.
    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(pokemon: Pokemon) {

            // Se implementa Glide al adaptador.
            Glide.with(itemView.context).load(pokemon.imgUrl).into(binding.ivPokemonImage)
            binding.tvPokemonName.text = pokemon.name
            binding.tvPokemonType.text = pokemon.type
            binding.tvPokemonId.text = pokemon.id
        }
    }
}
