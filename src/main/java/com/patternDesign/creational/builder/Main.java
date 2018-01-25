package com.patternDesign.creational.builder;

public class Main {
    public static void main(String args[]){
        LunchOrderBean lunchOrderBean = new LunchOrderBean();

        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());

        LunchOrderTelescope lunchOrderTelescope = new LunchOrderTelescope("Wheat", "Lettuce","Mustard", "Ham");

        System.out.println(lunchOrderTelescope.getBread());
        System.out.println(lunchOrderTelescope.getCondiments());
        System.out.println(lunchOrderTelescope.getDressing());
        System.out.println(lunchOrderTelescope.getMeat());

        System.out.println("====================");

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

        builder = new LunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mustard");

        lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
