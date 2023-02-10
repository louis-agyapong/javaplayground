package org.playground;

public class Main {
    public static void main(String[] args) {
        String city;
        city = "San Francisco";
        int stringLength = city.length();

        char oneChar = city.charAt(0);
        System.out.println(oneChar);

        String upperCity = city.toUpperCase();
        System.out.println(upperCity);

        String lowerCity = city.toLowerCase();


    }
}