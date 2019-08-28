package com.example.sampleprojectforyara.model;

import com.google.gson.annotations.SerializedName;

public class RetrofitGetResponse {

    @SerializedName("Title")
    private String Title;
    @SerializedName("Year")
    private String Year;
    @SerializedName("imdbID")
    private String imdbID;

    @SerializedName("Type")
    private String Type;

    @SerializedName("Poster")
    private String Poster;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    //    @SerializedName("Type")
//    private String Type;
//    @SerializedName("Poster")
//    private String Poster;
//
//    public String getTitle() {
//        return Title;
//    }
//
//    public void setTitle(String title) {
//        Title = title;
//    }
//
//    public String getYear() {
//        return Year;
//    }
//
//    public void setYear(String year) {
//        Year = year;
//    }
//
//    public String getImdbID() {
//        return imdbID;
//    }
//
//    public void setImdbID(String imdbID) {
//        this.imdbID = imdbID;
//    }
//
//    public String getType() {
//        return Type;
//    }
//
//    public void setType(String type) {
//        Type = type;
//    }
//
//    public String getPoster() {
//        return Poster;
//    }
//
//    public void setPoster(String poster) {
//        Poster = poster;
//    }
}

