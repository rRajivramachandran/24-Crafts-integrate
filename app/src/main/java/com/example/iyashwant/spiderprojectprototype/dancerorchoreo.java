package com.example.iyashwant.spiderprojectprototype;

/**
 * Created by rajiv on 6/8/17.
 */


public class dancerorchoreo extends Actoractresscommon {
    String facial_hair;//if male

    Boolean is_ownsoundtrack, is_ownchoreo, istrained, is_filmtv_perform;

    public String getLink_own_sound_track() {
        return link_own_sound_track;
    }

    public void setLink_own_sound_track(String link_own_sound_track) {
        this.link_own_sound_track = link_own_sound_track;
    }

    public String getTrain_detail() {
        return train_detail;
    }

    public void setTrain_detail(String train_detail) {
        this.train_detail = train_detail;
    }

    String link_own_sound_track, link_ownchoreo, dancing_style, train_detail,  link_film_tvperform;//main or side dancer or choreo

    public String getFacial_hair() {
        return facial_hair;
    }

    public void setFacial_hair(String facial_hair) {
        this.facial_hair = facial_hair;
    }

    public Boolean getIs_ownsoundtrack() {
        return is_ownsoundtrack;
    }

    public void setIs_ownsoundtrack(Boolean is_ownsoundtrack) {
        this.is_ownsoundtrack = is_ownsoundtrack;
    }

    public Boolean getIs_ownchoreo() {
        return is_ownchoreo;
    }

    public void setIs_ownchoreo(Boolean is_ownchoreo) {
        this.is_ownchoreo = is_ownchoreo;
    }

    public Boolean getIstrained() {
        return istrained;
    }

    public void setIstrained(Boolean istrained) {
        this.istrained = istrained;
    }

    public Boolean getIs_filmtv_perform() {
        return is_filmtv_perform;
    }

    public void setIs_filmtv_perform(Boolean is_filmtv_perform) {
        this.is_filmtv_perform = is_filmtv_perform;
    }



    public String getLink_ownchoreo() {
        return link_ownchoreo;
    }

    public void setLink_ownchoreo(String link_ownchoreo) {
        this.link_ownchoreo = link_ownchoreo;
    }

    public String getDancing_style() {
        return dancing_style;
    }

    public void setDancing_style(String dancing_style) {
        this.dancing_style = dancing_style;
    }





    public String getLink_film_tvperform() {
        return link_film_tvperform;
    }

    public void setLink_film_tvperform(String link_film_tvperform) {
        this.link_film_tvperform = link_film_tvperform;
    }

    public String getInterest_field() {
        return interest_field;
    }

    public void setInterest_field(String interest_field) {
        this.interest_field = interest_field;
    }

    String interest_field;
    String pic_link;

    public String getPic_link() {
        return pic_link;
    }

    public void setPic_link(String pic_link) {
        this.pic_link = pic_link;
    }

    public String getVideo_link() {
        return video_link;
    }

    public void setVideo_link(String video_link) {
        this.video_link = video_link;
    }

    String video_link;
    dancerorchoreo()
    {
        facial_hair = null;
        is_filmtv_perform = false;
        is_ownchoreo = false;
        istrained = false;
        is_ownsoundtrack = false;
        link_film_tvperform = null;
        link_own_sound_track = null;
        dancing_style = null;
        interest_field=null;
        pic_link=null;
        video_link=null;
        train_detail=null;

    }
}