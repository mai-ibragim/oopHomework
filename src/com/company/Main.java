package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Bitte geben Sie Breite und Höhe des Dreiecks ein: ");
        triangle.area(scan.nextInt(), scan.nextInt());
    }
}
