package Projects;

import Lecture.ArrayFuncs.ExpandableArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;

public class MaterialProcessor {

    public static void readFile(String fileName) throws IOException {

        FileReader fr = new FileReader(fileName); //mac does not need to define the disk, uses / instead of \
        BufferedReader br = new BufferedReader(fr);

        while (true) {
            String s = br.readLine();
            System.out.println(s);

            if (s == null) {
                break;
            }
        }

        fr.close();
    }

    public static String conv(boolean b) {
        if (b) {
            return "x";
        }else{
            return " ";
        }
    }

    public static boolean test(String input, String s) {
        return input.contains(s);
    }

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/Joseph/Desktop/ingots.txt"); //mac does not need to define the disk, uses / instead of \
        BufferedReader br = new BufferedReader(fr);
        System.out.println("material\tplate\tdense plate");

        String s = br.readLine();
        //generate list of materials in separate vars
        boolean plate, dense_plate, rod, long_rod, gear, small_gear, screw_bolt, rotor, foil, ring, frame, lens, spring, fine_wire = false;
        String mat = s.substring(0, s.indexOf(" ="));
        //System.out.println("material: " + mat);

        //read the line and set vars to be able to output
        plate = test(s, "GENERATE_PLATE");
        dense_plate = test(s, "GENERATE_DENSE");
        rod = test(s, "GENERATE_ROD");
        rod = test(s, "GENERATE_ROD");

        System.out.println(mat + ": \t" + conv(plate));
/*
        while (true) {
            String s = br.readLine();

            System.out.println(s);

            if (s == null) {
                break;
            }
        }
*/
        fr.close();
    }
}
