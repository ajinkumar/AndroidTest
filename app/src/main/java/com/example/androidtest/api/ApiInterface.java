package com.example.androidtest.api;

import com.example.androidtest.model.AlertDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Ajin kumar on 18/7/18.
 */

public interface ApiInterface {

    @GET
    Call<AlertDetails> getAllDetails(@Url String var1);

}
