package com.example.iyashwant.spiderprojectprototype;

/**
 * Created by rakesh on 7/8/17.
 */

public class AssistantDirector extends CommontoAll {

    boolean istvshow,isshotfilm,ispassport,islookingdirector,islookingcrew,islookingproducer;
    String tv_show;
    String short_film;

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

    public boolean istvshow() {
        return istvshow;
    }

    public void setIstvshow(boolean istvshow) {
        this.istvshow = istvshow;
    }

    public boolean isshotfilm() {
        return isshotfilm;
    }

    public void setIsshotfilm(boolean isshotfilm) {
        this.isshotfilm = isshotfilm;
    }

    public String getTv_show() {
        return tv_show;
    }

    public void setTv_show(String tv_show) {
        this.tv_show = tv_show;
    }

    public String getShort_film() {
        return short_film;
    }

    public void setShort_film(String short_film) {
        this.short_film = short_film;
    }

    public boolean ispassport() {
        return ispassport;
    }

    public void setIspassport(boolean ispassport) {
        this.ispassport = ispassport;
    }

    public boolean islookingdirector() {
        return islookingdirector;
    }

    public void setIslookingdirector(boolean islookingdirector) {
        this.islookingdirector = islookingdirector;
    }

    public boolean islookingcrew() {
        return islookingcrew;
    }

    public void setIslookingcrew(boolean islookingcrew) {
        this.islookingcrew = islookingcrew;
    }

    public boolean islookingproducer() {
        return islookingproducer;
    }

    public void setIslookingproducer(boolean islookingproducer) {
        this.islookingproducer = islookingproducer;
    }


    AssistantDirector()
    {

        istvshow=false;
        tv_show=null;
        pic_links=null;
        video_links=null;
        isshotfilm=false;
        short_film=null;
        islookingcrew = false;
        islookingdirector = false;
        islookingproducer = false;
        ispassport = false;

    }
}
