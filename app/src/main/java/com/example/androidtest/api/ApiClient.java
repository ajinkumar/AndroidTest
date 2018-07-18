package com.example.androidtest.api;

import android.app.Application;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Ajin kumar on 18/7/18.
 */

public class ApiClient {

    public static Retrofit getClient() {

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request newRequest  = chain.request().newBuilder()
                        .addHeader("Authorization", "Bearer 044f910c-f202-482c-9119-72509e6f838a")
                        .build();
                return chain.proceed(newRequest);
            }
        }).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://35.164.28.104:8080/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(new Gson())).build();

        return retrofit;
    }
}