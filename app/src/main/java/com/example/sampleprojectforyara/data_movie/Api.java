package com.example.sampleprojectforyara.data_movie;

import com.example.sampleprojectforyara.model.search;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {


    @GET("?apikey=3e974fca")
    Call<search> GetEmployeeData(@Query("s") String s);
}
