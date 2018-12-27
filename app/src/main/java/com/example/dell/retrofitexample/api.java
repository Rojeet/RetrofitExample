package com.example.dell.retrofitexample;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();


}
