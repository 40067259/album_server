package com.concordia.a2.config;

public class Lab11 {

    public static double q4a(double lastM,double curM, double lastC, double curC){
        double lastRate = lastM / lastC;
        double curRate = curM / curC;
        double rate = (curRate - lastRate) / lastRate;
        return rate * 100;
    }

    public static double q4b(double lastM,double curM, double lastC, double curC,double cpiLastM,
                             double cpiCurM,double cpiLastC, double cpiCurC){
        double lastRate = (lastM / lastC)*cpiLastC/cpiLastM;
        double curRate = (curM / curC)* cpiCurC/cpiCurM;
        double rate = (curRate - lastRate) / lastRate;
        return rate * 100;

    }
    public static void main(String[] args) {
        System.out.println(q4a(8.96,8.77,6.8,6.7));
        System.out.println(q4b(8.96,8.77,6.8,6.7,105,125,100,110));
        System.out.println(q4a(1.14,0.99,88.94,88.77));
        System.out.println(q4b(1.14,0.99,88.94,88.77,110,115,90,105));

    }
}
