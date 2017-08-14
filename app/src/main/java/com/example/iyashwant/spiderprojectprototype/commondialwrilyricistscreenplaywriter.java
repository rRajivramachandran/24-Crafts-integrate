package com.example.iyashwant.spiderprojectprototype;

/**
 * Created by rakesh on 7/8/17.
 */

public class commondialwrilyricistscreenplaywriter extends CommontoAll{

    boolean is_tvperform;
    boolean ispassport;

    public String getVideolinks() {
        return videolinks;
    }

    public void setVideolinks(String videolinks) {
        this.videolinks = videolinks;
    }

    public String getPiclinks() {
        return piclinks;
    }

    public void setPiclinks(String piclinks) {
        this.piclinks = piclinks;
    }

    String piclinks,videolinks;

    public boolean is_tvperform() {
        return is_tvperform;
    }

    public void setIs_tvperform(boolean is_tvperform) {
        this.is_tvperform = is_tvperform;
    }

    public boolean isadditional() {
        return isadditional;
    }

    public void setIsadditional(boolean isadditional) {
        this.isadditional = isadditional;
    }

    public String getTv_desc() {
        return tv_desc;
    }

    public void setTv_desc(String tv_desc) {
        this.tv_desc = tv_desc;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    boolean isadditional;
    String language_writttendialorlyrorscript,tv_desc,additional;



    public boolean ispassport() {
        return ispassport;
    }

    public void setIspassport(boolean ispassport) {
        this.ispassport = ispassport;
    }

    public String getLanguage_writttendialorlyrorscript() {
        return language_writttendialorlyrorscript;
    }

    public void setLanguage_writttendialorlyrorscript(String language_writttendialorlyrorscript) {
        this.language_writttendialorlyrorscript = language_writttendialorlyrorscript;
    }


    commondialwrilyricistscreenplaywriter()
    {
        ispassport = false;
        tv_desc=null;additional=null;
        is_tvperform=false;
        isadditional=false;
        piclinks=null;
        videolinks=null;
        language_writttendialorlyrorscript = null;

    }
}
