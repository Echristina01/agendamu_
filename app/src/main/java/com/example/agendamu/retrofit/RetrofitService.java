package com.example.agendamu.retrofit;


import com.google.android.gms.common.internal.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    private static ApiEndpoints api;
    public static final String BASE_URL = "http://localhost:8000/api/";

    private static RetrofitService service;

    private RetrofitService() {
        api = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiEndpoints.class);
    }

    public static ApiEndpoints getAPIInterface(){
        return this.api;
    }

    public static RetrofitService getInstance() {
        if (service == null) {
            service = new RetrofitService();
        }
        return service;
    }
}
