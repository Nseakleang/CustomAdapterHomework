package com.seakleang.customadapterhomework.entity;

public class Video {

    private String id;
    private String image;
    private String title;
    private String channel;
    private String timepost;
    private String view;

    public Video() {
    }

    public Video(String image, String title, String channel, String timepost, String view) {
        this.image = image;
        this.title = title;
        this.channel = channel;
        this.timepost = timepost;
        this.view = view;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setTimepost(String timepost) {
        this.timepost = timepost;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getChannel() {
        return channel;
    }

    public String getTimepost() {
        return timepost;
    }

    public String getView() {
        return view;
    }
}
