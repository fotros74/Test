package com.example.test;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/api/mobile/PlayList/Get/1/20/0")
    Call<MusicItems> getJson();

}
