package com.leetcode.PPS_Group_Project;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CSV2jSON {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Car Maintenance Record.csv"));
        String append = "";
        sc.useDelimiter(",");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.println(append);
            append = append + sc.next();

        }
        sc.close();  //closes the scanner
        String[] s = append.split("\n");
        System.out.println(Arrays.toString(s));
        System.out.println(append.trim());


    }
}
