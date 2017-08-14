package com.example.iyashwant.spiderprojectprototype;

/**
 * Created by rajiv on 6/8/17.
 */

public class CommontoAll {
    String First_Name;
    String Last_name;
    String email_id;
    String Gender;
    String Date_Of_Birth;
    String Langauges_Spoken;
    String Native;
    String password;
    String Residing_In;
    String Contact_Phone_Number;
    String interested_in;
    String bio;






    public String getInterest_role() {
        return interest_role;
    }

    public void setInterest_role(String interest_role) {
        this.interest_role = interest_role;
    }

    String interest_role;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_name() {
        return Last_name;
    }
    public void setEmail_id(String email_id)
    {
        this.email_id = email_id;
    }
    public String getEmail_id()
    {
        return email_id;
    }
    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getDate_Of_Birth() {
        return Date_Of_Birth;
    }

    public void setDate_Of_Birth(String date_Of_Birth) {
        Date_Of_Birth = date_Of_Birth;
    }

    public String getLangauges_Spoken() {
        return Langauges_Spoken;
    }

    public void setLangauges_Spoken(String langauges_Spoken) {
        Langauges_Spoken = langauges_Spoken;
    }

    public String getNative() {
        return Native;
    }

    public void setNative(String aNative) {
        Native = aNative;
    }

    public String getResiding_In() {
        return Residing_In;
    }

    public void setResiding_In(String residing_In) {
        Residing_In = residing_In;
    }

    public String getContact_Phone_Number() {
        return Contact_Phone_Number;
    }

    public void setContact_Phone_Number(String contact_Phone_Number) {
        Contact_Phone_Number = contact_Phone_Number;
    }

    public String getInterested_in() {
        return interested_in;
    }

    public void setInterested_in(String interested_in) {
        this.interested_in = interested_in;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    CommontoAll()
    {
        First_Name = null;
        Last_name = null;
        Gender = null;
        email_id=null;
        Date_Of_Birth = null;
        Langauges_Spoken = null;
        Native = null;
        Residing_In = null;
        Contact_Phone_Number = null;
        interested_in = null;
        bio = null;
    }
}

