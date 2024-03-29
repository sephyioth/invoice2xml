package com.genesis.ginvoice.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CARD".
 */
public class Card {

    private Long id;
    private Integer num;
    private Float price;
    private String introduction;
    private String time;
    private String doc_path;

    public Card() {
    }

    public Card(Long id) {
        this.id = id;
    }

    public Card(Long id, Integer num, Float price, String introduction, String time, String doc_path) {
        this.id = id;
        this.num = num;
        this.price = price;
        this.introduction = introduction;
        this.time = time;
        this.doc_path = doc_path;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDoc_path() {
        return doc_path;
    }

    public void setDoc_path(String doc_path) {
        this.doc_path = doc_path;
    }

}
