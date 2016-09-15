package com.company;

public class Main {

    public static void main(String[] args) {
	// Math Class
        double p = Math.abs(-7.9);
        System.out.println(p);
        //void does not return data
        double exp = Math.pow(2,3);
        System.out.println(exp);
        double pi = Math.PI;
        System.out.println(pi);
        //ceil is short for ceiling gives the smallest integer greater than the value
        System.out.println(Math.ceil(4.5));
        System.out.println(Math.random());
        //Math.random goes from 0 to 1 and non-inclusive of 1
        int rd = (int)(Math.random()*100);
        System.out.println(rd);
    }
}
