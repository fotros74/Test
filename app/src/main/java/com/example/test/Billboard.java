package com.example.test;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Billboard {

    @SerializedName("billboard_type")
    @Expose
    private String billboardType;
    @SerializedName("billboard_no")
    @Expose
    private String billboardNo;
    @SerializedName("update_date")
    @Expose
    private String updateDate;
    @SerializedName("billboard_songnum")
    @Expose
    private String billboardSongnum;
    @SerializedName("havemore")
    @Expose
    private Integer havemore;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("pic_s192")
    @Expose
    private String picS192;
    @SerializedName("pic_s640")
    @Expose
    private String picS640;
    @SerializedName("pic_s444")
    @Expose
    private String picS444;
    @SerializedName("pic_s260")
    @Expose
    private String picS260;
    @SerializedName("pic_s210")
    @Expose
    private String picS210;
    @SerializedName("web_url")
    @Expose
    private String webUrl;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("bg_color")
    @Expose
    private String bgColor;
    @SerializedName("bg_pic")
    @Expose
    private String bgPic;
    @SerializedName("id")
    @Expose
    private Integer id;

    public String getBillboardType() {
        return billboardType;
    }

    public void setBillboardType(String billboardType) {
        this.billboardType = billboardType;
    }

    public String getBillboardNo() {
        return billboardNo;
    }

    public void setBillboardNo(String billboardNo) {
        this.billboardNo = billboardNo;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getBillboardSongnum() {
        return billboardSongnum;
    }

    public void setBillboardSongnum(String billboardSongnum) {
        this.billboardSongnum = billboardSongnum;
    }

    public Integer getHavemore() {
        return havemore;
    }

    public void setHavemore(Integer havemore) {
        this.havemore = havemore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPicS192() {
        return picS192;
    }

    public void setPicS192(String picS192) {
        this.picS192 = picS192;
    }

    public String getPicS640() {
        return picS640;
    }

    public void setPicS640(String picS640) {
        this.picS640 = picS640;
    }

    public String getPicS444() {
        return picS444;
    }

    public void setPicS444(String picS444) {
        this.picS444 = picS444;
    }

    public String getPicS260() {
        return picS260;
    }

    public void setPicS260(String picS260) {
        this.picS260 = picS260;
    }

    public String getPicS210() {
        return picS210;
    }

    public void setPicS210(String picS210) {
        this.picS210 = picS210;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getBgPic() {
        return bgPic;
    }

    public void setBgPic(String bgPic) {
        this.bgPic = bgPic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}