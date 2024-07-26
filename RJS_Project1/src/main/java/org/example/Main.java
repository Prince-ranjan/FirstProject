package org.example;

public class Main {
    public static void main(String[] args) {


        Circle c = new Circle(7);

        System.out.println(c.area());

        System.out.println(c.perimeter());

        Rectange r = new Rectange(10, 5);

        System.out.println(r.area());
        System.out.println(r.perimeter());

//
//        Pen bluePen = new Pen("ball Pen", "Linc", "Blue");
//
//        Pen blackPen = new Pen("Gel pen", "Renyolds", "Black");
//
//        bluePen.getCountryOfOrigin();
//
//        Fan srutiHouseFan = new Fan("Ceiling", "Bajaj", "grey", 3, 60);
//
//        System.out.println(srutiHouseFan.getType());
//
//        srutiHouseFan.setType("Wall fan");
//
//        System.out.println(srutiHouseFan.getType());
//
//
//        Television RajendraTv = new Television("Samsung", "Black", "55", "20/12/2023", false);
//
//        Television myTv = new Television("LG", "Gray", "43", "20/10/2020", true);
//
////        RajendraTv.powerOn();
////
////        RajendraTv.powerOf();
//
//        int[] arr = new int[6];
//
//        boolean[] booleanArr = new boolean[10];
//
//        booleanArr[0] = true;
//
//        booleanArr[2] = true;
//
//        booleanArr[4] = true;
//
//        booleanArr[6] = true;
//
//        booleanArr[8] = true;
////        for(int i = 0; i <= 9; i++) {
////            System.out.println(booleanArr[i]);
////        }
//        // index on arrays starts from 0 it goes to size - 1
//
//        arr[0] = 0;
//        arr[1] = 1;
//        arr[2] = 2;
//        arr[3] = 3;
//        arr[4] = 4;
//        arr[5] = 5;
//
////        for(int index = 0; index < 5; index++) {
////            System.out.println(arr[index]);
////        }

    }
}