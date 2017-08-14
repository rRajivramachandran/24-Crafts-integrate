package com.example.iyashwant.spiderprojectprototype;

/**
 * Created by rajiv on 6/8/17.
 */

public class singer extends CommontoAll {
    public boolean is_own_soundtrack() {
        return is_own_soundtrack;
    }

    public void setIs_own_soundtrack(boolean is_own_soundtrack) {
        this.is_own_soundtrack = is_own_soundtrack;
    }

    public boolean is_own_lyrics() {
        return is_own_lyrics;
    }

    public void setIs_own_lyrics(boolean is_own_lyrics) {
        this.is_own_lyrics = is_own_lyrics;
    }

    public boolean is_clasicallytrained() {
        return is_clasicallytrained;
    }

    public void setIs_clasicallytrained(boolean is_clasicallytrained) {
        this.is_clasicallytrained = is_clasicallytrained;
    }


    public boolean is_filmtv_perform() {
        return is_filmtv_perform;
    }

    public void setIs_filmtv_perform(boolean is_filmtv_perform) {
        this.is_filmtv_perform = is_filmtv_perform;
    }

    public String getLink_lyrics_own() {
        return link_lyrics_own;
    }

    public void setLink_lyrics_own(String link_lyrics_own) {
        this.link_lyrics_own = link_lyrics_own;
    }

    public String getLink_own_sound_track() {
        return link_own_sound_track;
    }

    public void setLink_own_sound_track(String link_own_sound_track) {
        this.link_own_sound_track = link_own_sound_track;
    }



    public String getSinging_style() {
        return singing_style;
    }

    public void setSinging_style(String singing_style) {
        this.singing_style = singing_style;
    }

    public String getClassical_train_years() {
        return classical_train_years;
    }

    public void setClassical_train_years(String classical_train_years) {
        this.classical_train_years = classical_train_years;
    }

    boolean is_own_soundtrack,is_own_lyrics,is_clasicallytrained,is_dubsmash,is_TVshow,is_filmtv_perform;
    String link_lyrics_own;

    public boolean is_dubsmash() {
        return is_dubsmash;
    }

    public void setIs_dubsmash(boolean is_dubsmash) {
        this.is_dubsmash = is_dubsmash;
    }

    public boolean is_TVshow() {
        return is_TVshow;
    }

    public void setIs_TVshow(boolean is_TVshow) {
        this.is_TVshow = is_TVshow;
    }

    public String getLink_dubsmash() {
        return link_dubsmash;
    }

    public void setLink_dubsmash(String link_dubsmash) {
        this.link_dubsmash = link_dubsmash;
    }

    public String getLinkTvshow() {
        return linkTvshow;
    }

    public void setLinkTvshow(String linkTvshow) {
        this.linkTvshow = linkTvshow;
    }

    public String getPhotolinks() {
        return photolinks;
    }

    public void setPhotolinks(String photolinks) {
        this.photolinks = photolinks;
    }

    public String getVideolinks() {
        return videolinks;
    }

    public void setVideolinks(String videolinks) {
        this.videolinks = videolinks;
    }

    String link_own_sound_track;
    String link_dubsmash;
    String linkTvshow;
    String photolinks;
    String videolinks;
    String singing_style,classical_train_years;

    singer()
    {
        is_clasicallytrained = false;
        is_filmtv_perform = false;
        is_own_lyrics = false;
        is_own_soundtrack = false;
        is_dubsmash=false;
        is_TVshow=false;
        link_lyrics_own = null;
        linkTvshow=null;
        photolinks=null;
        videolinks=null;
        link_own_sound_track = null;
        link_dubsmash = null;
        singing_style = null;
        classical_train_years = null;
    }


}
