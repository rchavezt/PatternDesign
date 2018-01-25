package com.patternDesign.creational.singleton;

public class Main {

    public static void main(String arg[]){
        StaticSingleton instance = StaticSingleton.getInstance();
        StaticSingleton instance2 = StaticSingleton.getInstance();

        System.out.println(instance);
        System.out.println(instance2);

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton);
        System.out.println(lazySingleton2);

        Threadsafe threadsafe = Threadsafe.getInstance();
        Threadsafe threadsafe2 = Threadsafe.getInstance();

        System.out.println(threadsafe);
        System.out.println(threadsafe2);
    }
}
