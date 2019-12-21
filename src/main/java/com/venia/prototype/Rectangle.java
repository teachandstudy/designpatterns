package com.venia.prototype;

/**
 * Created by HOME on 21.12.2019.
 */
public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle() {}

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
