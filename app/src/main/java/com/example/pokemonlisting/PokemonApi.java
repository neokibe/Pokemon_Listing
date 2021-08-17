package com.example.pokemonlisting;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokemonApi {

    String BASE_URL = "https://pokeapi.co/api/v2/pokemon/ditto";
    @GET("https://pokeapi.co/api/v2/pokemon/ditto")
    Call<List<Results>> getsuperHeroes();
}