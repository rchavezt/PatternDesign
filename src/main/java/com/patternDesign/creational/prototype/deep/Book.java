package com.patternDesign.creational.prototype.deep;

public class Book extends Item {
    private int numberOfPages;

    public int getNumberOfPages(){
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
}
