package com.example.iyashwant.spiderprojectprototype;

/**
 * Created by rakesh on 7/8/17.
 */

public class storyboardartist extends CommontoAll {



    public boolean ispassport() {
        return ispassport;
    }

    public void setIspassport(boolean ispassport) {
        this.ispassport = ispassport;
    }



    boolean is_tvshow,ispassport;
    String tv_showdesc;
    String design_on;

    public boolean is_tvshow() {
        return is_tvshow;
    }

    public void setIs_tvshow(boolean is_tvshow) {
        this.is_tvshow = is_tvshow;
    }

    public String getTv_showdesc() {
        return tv_showdesc;
    }

    public void setTv_showdesc(String tv_showdesc) {
        this.tv_showdesc = tv_showdesc;
    }

    public String getDesign_on() {
        return design_on;
    }

    public void setDesign_on(String design_on) {
        this.design_on = design_on;
    }

    public String getDesign_type() {
        return design_type;
    }

    public void setDesign_type(String design_type) {
        this.design_type = design_type;
    }

    String design_type;

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

    String pic_links;
    String video_links;


    storyboardartist()
    {

        is_tvshow=false;
        tv_showdesc=null;
        design_on=null;
        design_type=null;
        ispassport = false;
        pic_links=null;
        video_links=null;

    }

}
