package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int i = 1;
        while (i <= cathetusLength) {
            for (int j = cathetusLength; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            for (int j = 1; j < cathetusLength; j++) {
                if (j + 1 > i) {
                    System.out.print("");
                } else {
                    System.out.print(j + 1);
                }
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
