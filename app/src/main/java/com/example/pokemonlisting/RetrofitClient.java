package com.example.pokemonlisting;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static RetrofitClient instance = null;
    private PokemonApi myPokemonApi;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(PokemonApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myPokemonApi = retrofit.create(PokemonApi.class);
    }

    public static synchronized RetrofitClient getInstance() {
        if (instance == null) {
            instance = new RetrofitClient();
        }
        return instance;
    }

    public PokemonApi getMyPokemonApi() {
        return myPokemonApi;
    }
}