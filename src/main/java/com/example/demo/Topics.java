package com.example.demo;

public class Topics {
    private  String id;
    private  String name;
    private  String descr;

    public Topics(){

    }

    public Topics(String id, String name, String descr) {
        this.id = id;
        this.name = name;
        this.descr = descr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public void add(Topics topics) {
    }
}
