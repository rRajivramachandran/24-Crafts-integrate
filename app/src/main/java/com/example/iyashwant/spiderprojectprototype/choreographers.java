package com.example.iyashwant.spiderprojectprototype;

/**
 * Created by rakesh on 7/8/17.
 */

public class choreographers extends CommontoAll {
    boolean is_ownsoundtrack,is_trained,is_tvshow;
    String pic_links;

    public String getPic_links() {
        return pic_links;
    }

    public void setPic_links(String pic_links) {
        this.pic_links = pic_links;
    }

    public String getVideo_links() {
        return video_links;
    }

    public void setVideo_links(String video_links) {
        this.video_links = video_links;
    }

    String video_links;

    public boolean is_ownsoundtrack() {
        return is_ownsoundtrack;
    }

    public void setIs_ownsoundtrack(boolean is_ownsoundtrack) {
        this.is_ownsoundtrack = is_ownsoundtrack;
    }

    public boolean is_trained() {
        return is_trained;
    }

    public void setIs_trained(boolean is_trained) {
        this.is_trained = is_trained;
    }

    public boolean is_tvshow() {
        return is_tvshow;
    }

    public void setIs_tvshow(boolean is_tvshow) {
        this.is_tvshow = is_tvshow;
    }

    @Override
    public String getInterested_in() {
        return interested_in;
    }

    @Override
    public void setInterested_in(String interested_in) {
        this.interested_in = interested_in;
    }

    public String getSound_track() {
        return sound_track;
    }

    public void setSound_track(String sound_track) {
        this.sound_track = sound_track;
    }

    public String getDance_style() {
        return dance_style;
    }

    public void setDance_style(String dance_style) {
        this.dance_style = dance_style;
    }

    public String getTrain_detail() {
        return train_detail;
    }

    public void setTrain_detail(String train_detail) {
        this.train_detail = train_detail;
    }

    public String getTv_show_desc() {
        return tv_show_desc;
    }

    public void setTv_show_desc(String tv_show_desc) {
        this.tv_show_desc = tv_show_desc;
    }

    public String getGroup_num() {
        return group_num;
    }

    public void setGroup_num(String group_num) {
        this.group_num = group_num;
    }

    String interested_in;
    String sound_track;
    String dance_style;
    String train_detail;
    String tv_show_desc;



    String group_num;
    public choreographers()
    {
        is_ownsoundtrack=false;
        is_trained=false;
        is_tvshow=false;
        interested_in=null;
        sound_track=null;
        dance_style=null;
        train_detail=null;
        tv_show_desc=null;
        group_num=null;
        pic_links=null;
        video_links=null;
    }


}
