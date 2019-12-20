package com.venia.example;

public interface Component extends Leaf{
    void add(Leaf leaf);
    void remove(Leaf leaf);
    String operation();

}
