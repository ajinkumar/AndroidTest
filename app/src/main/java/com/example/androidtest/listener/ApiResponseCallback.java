package com.example.androidtest.listener;

import com.example.androidtest.listener.CallbackListener;

/**
 * Created by Ajin kumar on 18/7/18.
 */

public class ApiResponseCallback<T> implements CallbackListener<T> {

	private CallbackListener<T> callbackListener;

	public ApiResponseCallback(CallbackListener<T> callbackListener) {
		this.callbackListener = callbackListener;
	}

	@Override
	public void onSuccess(T value) {
		callbackListener.onSuccess(value);
	}

	@Override
	public void onResponseCode(Integer code) {
		callbackListener.onResponseCode(code);
	}

	@Override
	public void onError(int errorCode) {
		callbackListener.onError(errorCode);
	}
}
