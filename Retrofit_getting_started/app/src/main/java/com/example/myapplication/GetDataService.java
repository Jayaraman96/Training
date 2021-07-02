package com.example.myapplication;

import android.app.Activity;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("popular?api_key=21cf9e58fa9fb18d1769658101c2fa34&page=1")
    Call<ServerResponse> getAllPhotosPopular();

    @GET("upcoming?api_key=21cf9e58fa9fb18d1769658101c2fa34&page=1")
    Call<ServerResponse> getAllPhotosUpcoming();
}
