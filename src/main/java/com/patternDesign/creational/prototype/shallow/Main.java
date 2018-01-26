package com.patternDesign.creational.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){

        //Shallow copy -Clone all the objects, they are only referred
        String sql = "Select * From all";
        List<String> list = new ArrayList<>();
        list.add("Something");
        Record record = new Record();

        Statement statement = new Statement(sql, list, record);

        System.out.println(statement.getSql());
        System.out.println(statement.getParameters());
        System.out.println(statement.getRecord());

        Statement statement1 = statement.clone();

        System.out.println(statement1.getSql());
        System.out.println(statement1.getParameters());
        System.out.println(statement1.getRecord());
    }
}
