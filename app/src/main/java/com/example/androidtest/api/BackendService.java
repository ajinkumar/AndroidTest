package com.example.androidtest.api;

import com.example.androidtest.listener.ApiCallback;
import com.example.androidtest.listener.CallbackListener;
import com.example.androidtest.model.AlertDetails;

/**
 * Created by Ajin kumar on 18/7/18.
 */

public class BackendService {

    private static BackendService backendService;
    private final ApiInterface apiService;

    public BackendService() {
        apiService = ApiClient.getClient().create(ApiInterface.class);
    }

    public static BackendService getInstance() {
        if (backendService == null) {
            backendService = new BackendService();
        }

        return backendService;
    }


    public void getAllListValues(final CallbackListener<AlertDetails> callbackListener) {

        apiService
                .getAllDetails("alertmobile/getallpopularalerts?userId=623&latitude=13.0827&longitude=80.2707")
                .enqueue(new ApiCallback<>(callbackListener));
    }

}
