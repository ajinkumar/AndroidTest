package com.example.androidtest.listener;

/**
 * Created by Ajin kumar on 18/7/18.
 */

public interface CallbackListener<T> {
	void onSuccess(T value);

	void onResponseCode(Integer code);

	void onError(int errorCode);
}

