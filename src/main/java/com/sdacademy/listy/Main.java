package com.sdacademy.listy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomListImplementation<Integer> list = new CustomListImplementation<Integer>();

        list.add(2);
        list.add(2);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);

        System.out.println(list.get(4));

      //  for (CustomListImplementation list1: list)


    }
}
