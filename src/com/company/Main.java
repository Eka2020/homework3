package com.company;

import java.lang.reflect.Array;
import java.security.PublicKey;

public class Main {

    public static void main(String[] args) {
        String[] name = new String[3];
        name[0] = "Nyrzad";
        name[1] = "Kymbat";
        name[2] = "Aizat";
        for (int i = 0; i < 1; i++) {
            System.out.println(name[0] + " Добро пожаловать!");
            System.out.println(name[1] + " Добро пожаловать!");
            System.out.println(name[2] + " Добро пожаловать!");
            int number = 2;
            switch (number) {
                case 1:
                    System.out.println(name[0] + " доброе утро");
                    break;
                case 2:
                    System.out.println(name[1] + " добрый день");
                    break;
                case 3:
                    System.out.println(name[2] + " добрый вечер");
                    break;

          }
            }

        }
    }


