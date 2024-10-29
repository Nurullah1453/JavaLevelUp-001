package org.example;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Alan Uzunluğunu Giriniz");
        double alan = scan.nextDouble();
        System.out.println("Kenar Uzunluğunu Giriniz");
        double kenar = scan.nextDouble();
        System.out.println("Area of rectangle: " + area(alan,kenar));

        System.out.println("Enter radius of circle: ");
        double radius = scan.nextDouble();
        System.out.println("Area of circle: " + area(radius));
    }

    public static boolean shouldWakeUp (boolean isBarking,int clock){
        if (clock < 0 || clock > 23 || !isBarking){
            return false;
        }
        return clock >= 20 || clock <8;
    }

    public static boolean hasTeen (int firstAge,int secondAge,int thirdAge){
        return (firstAge > 13 && firstAge <= 19) ||
                (secondAge > 13 && secondAge <= 19) ||
                (thirdAge > 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp){
        int lowestTemp = 25;
        int highestTemp = isSummer ? 45 : 35 ;

        return temp < highestTemp && temp > lowestTemp;

    }

    public static double area(double alan , double kenar){

        if (alan <= 0 || kenar <= 0){
            System.out.println("Alan ve kenar uzunlukları 0'dan küçük olamaz");
            return -1 ;
        }
        return alan * kenar;

    }
    public static double area(double radius){
        if (radius<0){
            System.out.println("Radius cannot be less than zero!!! Radius: " + radius);
            return -1;
        }
        return Math.PI*Math.pow(radius,2);
    }

}
