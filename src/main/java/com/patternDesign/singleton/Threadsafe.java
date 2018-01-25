package com.patternDesign.singleton;

public class Threadsafe {
    private static Threadsafe instance = null;

    private Threadsafe(){
    }
    public static Threadsafe getInstance(){
        if (instance == null){
            synchronized (Threadsafe.class) {
                if (instance == null) // If repeated due the first one is not thread safe
                    instance = new Threadsafe();
            }
        }
        return instance;
    }
}
