package com.example.iyashwant.spiderprojectprototype;

/**
 * Created by rajiv on 6/8/17.
 */

public class Actoractresscommon extends CommontoAll {
    String Body_Type; //(Atheletic / Average / Petite / Thin / Heavy / other)
    String Hair_Color;// (Black, Brown, White, Red, Blonde, Burgundy, Ginger, other)
    String Hair_Length;// (Short, Medium, Long, Bald, Shaved, other)
    String Eye_Color; //(Black, Brown, Blue, Amber, Grey, Green, Hazel, other)
    String Skin_Tone; //(Very Fair, Fair, Medium, Olive, Brown, Dark, other)
    //String Facial_Hair; //(Beard, Moustache, Beard & Mustache, Stubble, None, other)
    String Height;// (either in Ft/Inches or in cm)

    String Weight;// (kgs)

    public String getBody_Type() {
        return Body_Type;
    }

    public void setBody_Type(String body_Type) {
        Body_Type = body_Type;
    }

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

    public String getWaist_Size() {
        return Waist_Size;
    }

    public void setWaist_Size(String waist_Size) {
        Waist_Size = waist_Size;
    }

    public String getChest_Size() {
        return Chest_Size;
    }

    public void setChest_Size(String chest_Size) {
        Chest_Size = chest_Size;
    }

    String Waist_Size;// (optional)
    String Chest_Size; //(optional)

    Actoractresscommon()
    {
        Body_Type = null;
        Hair_Color = null;
        Hair_Length = null;
        Eye_Color = null;
        Skin_Tone = null;
        Height = null;
        Weight = null;
        Waist_Size = null;
        Chest_Size = null;
    }

}
