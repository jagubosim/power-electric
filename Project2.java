package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Project2 {
    public static void main (String[] args){
        new Modulo_Division().modulo();
        new Approximating_Pi().pi();
        new Wind_Chill().chill();
        new Distance().distance();
        new ConvertToUpper().upper();
        new Circle().inCircle();
        new ThreeGuesses().guesses();
        new Taxes().taxes();
    }
}
class Modulo_Division{
    void modulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                  ");
        System.out.println("• This program will add all the digits of an integer");
        System.out.println("                                                  ");
        System.out.print("Enter an integer: ");
        int orig_integer = Integer.parseInt(sc.nextLine());
        int one;
        one = orig_integer % 1000;
        int two;
        two = orig_integer % 100;
        int three;
        three = orig_integer % 10;
        System.out.println("The sum of the digits is: " + ((one/100)+(two/10)+(three/1)));
    }
}
class Distance{
    void distance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                  ");
        System.out.println("• This program will calculate the distance between two points");
        System.out.println("                                                  ");
        System.out.print("Enter x1: ");
        double x1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter y1: ");
        double y1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter x2: ");
        double x2 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter y2: ");
        double y2 = Integer.parseInt(sc.nextLine());
        System.out.println("Your selected points are ("+x1+","+y1+") and ("+x2+","+y2+")");
        System.out.println("The distance is "+(Math.pow((Math.pow((x2-x1),2)+(Math.pow((y2-y1),2))),(1.0/2.0))));
    }
}
class Approximating_Pi{
    void pi() {
        System.out.println("                                                  ");
        System.out.println("• This program will approximate the digits of pi");
        System.out.println("                                                  ");
        double decimal;
        decimal = 1.0;
        System.out.println("The approximation of pi is "+ (4*(decimal-(1.0/3.0)+(1.0/5.0)-(1.0/7.0)+(1.0/9.0)-(1.0/11.0)+(1.0/13.0))));
    }
}
class Wind_Chill {
    void chill(){
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                  ");
        System.out.println("• This program will calculate the current wind chill");
        System.out.println("                                                  ");
        System.out.print("Enter the temperature (Fahrenheit): ");
        double T = Double.parseDouble(sc.nextLine());
        System.out.print("Enter the wind speed: ");
        double V = Double.parseDouble(sc.nextLine());
        System.out.println("The wind chill index is "+(35.74+(0.6215*T)-(35.75*Math.pow(V,0.16))+(0.4275*T*Math.pow(V,0.16))));
    }
}
class ConvertToUpper{
    void upper(){
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                  ");
        System.out.println("• This program will turn a string input into uppercase");
        System.out.println("                                                  ");
        System.out.print("Enter a letter: ");
       String letter = sc.nextLine();
       if (letter.equals("a") || letter.equals("b") || letter.equals("c") || letter.equals("d") || letter.equals("e") || letter.equals("f") || letter.equals("g") || letter.equals("h") || letter.equals("i") || letter.equals("j") || letter.equals("k") || letter.equals("l") || letter.equals("m") || letter.equals("n") || letter.equals("o") || letter.equals("p") || letter.equals("q") || letter.equals("r") || letter.equals("s") || letter.equals("t") || letter.equals("u") || letter.equals("v") || letter.equals("w") || letter.equals("x") || letter.equals("y") || letter.equals("z")) {
           System.out.println("The uppercase equivalent of "+letter+" is "+letter.toUpperCase());
       } else if (letter.equals("A") || letter.equals("B") || letter.equals("C") || letter.equals("D") || letter.equals("E") || letter.equals("F") || letter.equals("G") || letter.equals("H") || letter.equals("I") || letter.equals("J") || letter.equals("K") || letter.equals("L") || letter.equals("M") || letter.equals("N") || letter.equals("O") || letter.equals("P") || letter.equals("Q") || letter.equals("R") || letter.equals("S") || letter.equals("T") || letter.equals("U") || letter.equals("V") || letter.equals("W") || letter.equals("X") || letter.equals("Y") || letter.equals("Z")) {
           System.out.println("Already capitalized");
       } else {
           System.out.println("Not a letter.");
       }
    }
}
class Circle {
    void inCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                  ");
        System.out.println("• This program will calculate if a given coordinate point is within a circle of radius 5, centered at the origin");
        System.out.println("                                                  ");
        System.out.print("Enter the x coordinate: ");
        double c1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the y coordinate: ");
        double c2 = Integer.parseInt(sc.nextLine());
        double dist = (Math.pow(c1,2) + Math.pow(c2,2));
        if (dist >= 100 ){
            System.out.println("("+c1+","+c2+") is not in the circle.");
        } else {
            System.out.println("("+c1+","+c2+") is in the circle.");
        }
    }
}
class ThreeGuesses{
    void guesses(){
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                  ");
        System.out.println("• This program is a guessing game for a password. You have 3 tries.");
        System.out.println("                                                  ");
        System.out.print("Welcome to The People's Bank. Please enter your secret pin: ");
      int code = Integer.parseInt(sc.nextLine());
       if (code == 6329 ) {
           System.out.println("You're in!");
       } else {
           int code2;
           System.out.print("Incorrect code. Please try again: ");
           code2 = Integer.parseInt(sc.nextLine());
           if (code2 == 6329 ){
               System.out.println("You're in!");
           } else {
               int code3;
               System.out.print("Incorrect code. Please try again and note that this is your last chance before your account is locked: ");
               code3 = Integer.parseInt(sc.nextLine());
               if (code3 == 6329 ) {
                   System.out.println("You're in!");
               } else {
                   System.out.println("Your account is locked. Please call the customer service number to verify your identity and speak to a representaitve to unlock your account.");
               }
           }
       }
    }
}
class Taxes {
    void taxes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("                                                  ");
        System.out.println("• This program calculates which tax bracket you are in");
        System.out.println("                                                  ");
        System.out.print("What is your net taxable income? (Please enter a number greater than 0 and do not use '$' or ','): ");
        double tax = Integer.parseInt(sc.nextLine());
            DecimalFormat df = new DecimalFormat("$###,###.##");

            if (tax < 9325) {
                System.out.println("Your owed tax is " + df.format((.1 * tax)));
            }
            if (tax >= 9325 && tax < 37950) {
                System.out.println("Your owed tax is " + df.format(((932.5) + (.15 * (tax - 9325)))));
            }
            if (tax >= 37950 && tax < 91900) {
                System.out.println("Your owed tax is " + df.format(((5226.25) + (.25 * (tax - 37950)))));
            }
            if (tax >= 91900 && tax < 191650) {
                System.out.println("Your owed tax is " + df.format(((18713.75) + (.28 * (tax - 91900)))));
            }
            if (tax >= 191650 && tax < 416700) {
                System.out.println("Your owed tax is " + df.format(((46643.75) + (.33 * (tax - 191650)))));
            }
            if (tax >= 416700 && tax < 418400) {
                System.out.println("Your owed tax is " + df.format(((120910.25) + (.35 * (tax - 416700)))));
            }
            if (tax >= 418400) {
                System.out.println("Your owed tax is " + df.format(((121505.25) + (.39 * (tax - 418400)))));
            }
        }
    }

