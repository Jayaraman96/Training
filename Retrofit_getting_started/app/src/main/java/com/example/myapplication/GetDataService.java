package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("popular?api_key=21cf9e58fa9fb18d1769658101c2fa34&page=1")
    Call<ServerResponse> getAllPhotos();
}
