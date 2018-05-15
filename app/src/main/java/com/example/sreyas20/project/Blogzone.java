package com.example.sreyas20.project;

/**
 * Created by sreyas20 on 2/24/2018.
 */

public class Blogzone {
    private String title, desc, imageUrl, username;
    // generate their respective constructors
    public Blogzone(String title, String desc, String imageUrl, String username) {
        this.title = title;
        this.desc = desc;
        this.imageUrl=imageUrl;
        this.username = username;
    }
    // create an empty constructor
    public Blogzone() {
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public String getTitle() {
        return title;
    }
    public String getDesc() {
        return desc;
    }

    public String getUsername() {
        return username;
    }

}
