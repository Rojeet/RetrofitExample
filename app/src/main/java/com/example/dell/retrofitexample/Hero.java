package com.example.dell.retrofitexample;

public class Hero {

    private String name;
    private String realname;
    private String team;
    private String firstappearance;
    private String createdby;
    private String publisher;

    public Hero(String name, String realname, String team, String firstappearance, String createdby, String publisher) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstappearance = firstappearance;
        this.createdby = createdby;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublisher() {
        return publisher;
    }
}
