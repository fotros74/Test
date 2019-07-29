package com.example.test;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MusicItems {

    @SerializedName("song_list")
    @Expose
    private List<SongList> songList = null;
    @SerializedName("billboard")
    @Expose
    private Billboard billboard;
    @SerializedName("error_code")
    @Expose
    private Integer errorCode;

    public List<SongList> getSongList() {
        return songList;
    }

    public void setSongList(List<SongList> songList) {
        this.songList = songList;
    }

    public Billboard getBillboard() {
        return billboard;
    }

    public void setBillboard(Billboard billboard) {
        this.billboard = billboard;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

}