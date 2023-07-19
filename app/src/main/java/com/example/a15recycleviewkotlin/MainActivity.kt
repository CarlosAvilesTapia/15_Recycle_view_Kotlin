package com.example.a15recycleviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a15recycleviewkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Declaración de view binding.
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Se declara la variable binding y se infla la vista.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Llamado de la función para iniciar adapter.
        initPokemonAdapter()
    }

    private fun initPokemonAdapter() {
        val pokemonAdapter = PokemonAdapter() // Se inicia el adapter.
        val pokedex = Pokedex.getPokedex() // Se obtienen los datos.
        pokemonAdapter.setData(pokedex) // Se enlazan los datos al adapter.
        binding.rvPokemonList.adapter = pokemonAdapter // Se enlaza el adapter a la vista con VB.
    }
}
