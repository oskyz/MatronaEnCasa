package com.javier.matronaencasa;

/**
 * Created by Javier on 22/02/2016.
 */
public class Item {

    private int image;
    private String title;

    public Item() {
        super();
    }

    public Item(int image, String title) {
        super();
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
