package com.example.skatejungleproject;

public class SkateboardModel {

    private String skateboard_name;
    private String skateboard_desc;
    private double skateboard_price;
    private int skateboard_image;

    // Constructor
    public SkateboardModel(String skateboard_name, String skateboard_desc, double skateboard_price, int skateboard_image) {
        this.skateboard_name = skateboard_name;
        this.skateboard_desc = skateboard_desc;
        this.skateboard_price = skateboard_price;
        this.skateboard_image = skateboard_image;
    }

    // Getter and Setter
    public String getSkateboard_name() {
        return skateboard_name;
    }

    public void setSkateboard_name(String skateboard_name) {
        this.skateboard_name = skateboard_name;
    }

    public String getSkateboard_desc() {
        return skateboard_desc;
    }

    public void setSkateboard_desc(String skateboard_desc) {
        this.skateboard_desc = skateboard_desc;
    }

    public double getSkateboard_price() {
        return skateboard_price;
    }

    public void setSkateboard_price(int skateboard_price) {
        this.skateboard_price = skateboard_price;
    }

    public int getSkateboard_image() {
        return skateboard_image;
    }

    public void setSkateboard_image(int skateboard_image) {
        this.skateboard_image = skateboard_image;
    }
}
