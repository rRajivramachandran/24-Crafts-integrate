package com.example.iyashwant.spiderprojectprototype;

/**
 * Created by rajiv on 6/8/17.
 */

public class childartist extends CommontoAll {
    String Hair_Color;//(Black, Brown, White, Red, Blonder, Burgundy, Ginger, other)
    String Hair_Length;// (Short, Medium, Long, other)
    String Eye_Color; //(Black, Brown, Blue, Amber, Grey, Green, Hazel, other)
    String Skin_Tone;// (Very Fair, Fair, Medium, Olive, Brown, Dark, other)
    String Height; //(either in Ft/Inches or in cm)
    String Weight;// (kgs)
    boolean isdance,issing,ispriorexperience;
    String priorexperience_desc;
    String pic_links;
    String video_links;

    public String getPrior_exp_link() {
        return prior_exp_link;
    }

    public void setPrior_exp_link(String prior_exp_link) {
        this.prior_exp_link = prior_exp_link;
    }

    String prior_exp_link;
    String guardian_name;
    String guardian_no;

    public String getDance_style() {
        return dance_style;
    }

    public void setDance_style(String dance_style) {
        this.dance_style = dance_style;
    }

    public String getSing_style() {
        return sing_style;
    }

    public void setSing_style(String sing_style) {
        this.sing_style = sing_style;
    }

    String dance_style;
    String sing_style;

    public String getHair_Color() {
        return Hair_Color;
    }

    public void setHair_Color(String hair_Color) {
        Hair_Color = hair_Color;
    }

    public String getHair_Length() {
        return Hair_Length;
    }

    public void setHair_Length(String hair_Length) {
        Hair_Length = hair_Length;
    }

    public String getEye_Color() {
        return Eye_Color;
    }

    public void setEye_Color(String eye_Color) {
        Eye_Color = eye_Color;
    }

    public String getSkin_Tone() {
        return Skin_Tone;
    }

    public void setSkin_Tone(String skin_Tone) {
        Skin_Tone = skin_Tone;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public boolean isdance() {
        return isdance;
    }

    public void setIsdance(boolean isdance) {
        this.isdance = isdance;
    }

    public boolean issing() {
        return issing;
    }

    public void setIssing(boolean issing) {
        this.issing = issing;
    }

    public boolean ispriorexperience() {
        return ispriorexperience;
    }

    public void setIspriorexperience(boolean ispriorexperience) {
        this.ispriorexperience = ispriorexperience;
    }

    public String getPriorexperience_desc() {
        return priorexperience_desc;
    }

    public void setPriorexperience_desc(String priorexperience_desc) {
        this.priorexperience_desc = priorexperience_desc;
    }

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

    public String getGuardian_name() {
        return guardian_name;
    }

    public void setGuardian_name(String guardian_name) {
        this.guardian_name = guardian_name;
    }

    public String getGuardian_no() {
        return guardian_no;
    }

    public void setGuardian_no(String guardian_no) {
        this.guardian_no = guardian_no;
    }

    public String getGuardian_relation() {
        return guardian_relation;
    }

    public void setGuardian_relation(String guardian_relation) {
        this.guardian_relation = guardian_relation;
    }

    String guardian_relation;//if mother/father/other

    childartist()
    {
        Hair_Color = null;
        Hair_Length = null;
        Eye_Color = null;
        Skin_Tone = null;
        Height = null;
        Weight = null;
        isdance = false;
        issing = false;
        dance_style=null;
        sing_style=null;
        ispriorexperience = false;
        priorexperience_desc = null;
        pic_links = null;
        video_links = null;
        guardian_name = null;
        guardian_no = null;
        guardian_relation = null;
    }
}
