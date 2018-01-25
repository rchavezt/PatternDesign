package com.patternDesign.creational.builder;

public class LunchOrderTelescope {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderTelescope() {
        this.bread = bread;
    }

    public LunchOrderTelescope(String bread, String condiments) {
        this.bread = bread;
        this.condiments = condiments;
    }

    public LunchOrderTelescope(String bread, String condiments, String dressing) {
        this.bread = bread;
        this.condiments = condiments;
        this.dressing = dressing;
    }

    public LunchOrderTelescope(String bread, String condiments, String dressing, String meat) {
        this.bread = bread;
        this.condiments = condiments;
        this.dressing = dressing;
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
