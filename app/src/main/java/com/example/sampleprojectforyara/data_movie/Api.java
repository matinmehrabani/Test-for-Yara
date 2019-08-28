package com.example.sampleprojectforyara.data_movie;

import com.example.sampleprojectforyara.model.RetrofitGetResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface Api {


    @GET("/?apikey=3e974fca&s=batman")
    Call<List<RetrofitGetResponse>> GetEmployeeData();


}
