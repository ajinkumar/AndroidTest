package com.example.androidtest.listener;


import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Ajin kumar on 18/7/18.
 */

public class ApiCallback<T> implements Callback<T> {

    private CallbackListener<T> callbackListener;

    public ApiCallback(CallbackListener<T> callbackListener) {
        this.callbackListener = callbackListener;
    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.raw().cacheResponse() != null) {
            okhttp3.Response body2 = response.raw().cacheResponse();
        }
        if (response.body() != null) {
            callbackListener.onSuccess(response.body());
        } else {
            callbackListener.onResponseCode(response.code());
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        Log.e("eeror",""+t.getMessage());
    }
}
