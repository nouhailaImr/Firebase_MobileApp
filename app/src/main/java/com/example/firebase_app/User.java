package com.example.firebase_app;

public class User {
    String name,username,num,mission,date_depart,date_fin;

    public User() {
    }

    public User(String name, String username, String num, String mission, String date_depart, String date_fin) {
        this.name = name;
        this.username = username;
        this.num = num;
        this.mission = mission;
        this.date_depart = date_depart;
        this.date_fin = date_fin;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void setDate_depart(String date_depart) {
        this.date_depart = date_depart;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }
}
