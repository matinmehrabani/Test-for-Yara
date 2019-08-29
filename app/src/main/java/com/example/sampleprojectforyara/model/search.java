package com.example.sampleprojectforyara.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class search {

    @SerializedName("Search")
    private List<RetrofitGetResponse> list;

    public List<RetrofitGetResponse> getList() {
        return list;
    }

    public void setList(List<RetrofitGetResponse> list) {
        this.list = list;
    }
}
