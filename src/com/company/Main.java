// Denise Chen
// IS 147-04
// d189@umbc.edu
// 10/30/2021
// print an upside down half triangle with stars (*)

package com.company;

public class Main {
    public static void main(String[] args) {

        pyramidLoop();
    }

    public static void pyramidLoop() {
        int rows = 10;
        String star = "";

        for (int x = 0; x <= rows; x++) {
            for (int y = 0; y < rows - x; y++) {
                star += "*";
            }
            star += "\n";
        }
        System.out.println(star);
    }
}

