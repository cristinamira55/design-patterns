package com.kreitek.pets;

public class Logger {
    private static int counter = 0;
    public static void debug(String message) {
        counter++;
        System.out.println("[debug][" + counter + "] - " + message);
    }
}