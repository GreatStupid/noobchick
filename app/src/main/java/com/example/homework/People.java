package com.example.homework;

public class People {
    private String name;
    private String text;
    private  int imageId;

    public  People(String name,String text,int imageId){
        this.name=name;
        this.imageId=imageId;
        this.text=text;
    }

    public String getName(){
        return name;
    }

    public String getText(){
        return text;
    }
    public int getImageId(){
        return imageId;
    }
}
