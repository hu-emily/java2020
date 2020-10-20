//10-13-20 in class/homework
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.lang.*;
public class Chapter3Exercises {

    public static void main(String[] args) {

        //question 1
        printNumbers(15);
        printNumbers(5);

        //question 2
        printPowersOf2(3);
        printPowersOf2(10);

        //question 3
        printPowersOfN(4,3);
        printPowersOfN(5,6);
        printPowersOfN(-2,8);

        //question 4
        printSquare(3,7);

        //question 5
        printGrid(4,6);

        //question 15
        processName();
    }

    //question 1
    public static void printNumbers(int maximum){
        for(int i = 1; i <= maximum; i++){
            System.out.print("[" + i + "] ");
        }
        newLines();
    }

    //question 2
    public static void printPowersOf2(int maximum){
        for(double i = 0; i <= maximum; i++){
            double value = Math.pow(2,i);
            int value2 = (int) Math.round(value);
            System.out.print(value2 + " ");
        }
        newLines();
    }

    //question 3
    public static void printPowersOfN(int base, int maximum){
        System.out.print((int)Math.pow(base,maximum) + " ");
    }

    //question 4
    public static void printSquare(int minimum, int maximum){
        newLines();
        for(int i = minimum; i <= maximum; i++){
            for(int front= i; front <= maximum; front++){
                System.out.print(front);
            }
            for(int end = minimum; end < i; end++){
                System.out.print(end);
            }
            System.out.println();
        }
        newLines();
    }

    //question 5
    public static void printGrid(int rows, int columns){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                System.out.print(((i-1)*4)+i);
            }
            System.out.println();
        }
    }

    //question 6
    public static void largerAbsVal(){

    }

    //question 7
    public static void largestAbsValVariation(){

    }

    //question 8
    public static void quadratic(){

    }

    //question 9
    public static void distance(){

    }

    //question 10
    public static void scientific(){

    }

    //question 11
    public static void padString(){

    }

    //question 12
    public static void vertical(){

    }

    //question 13
    public static void printReverse(){

    }

    //question 14
    public static void inputBirthday(){
        
    }

    //question 15
    public static void processName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String name = input.nextLine();

        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0,spaceIndex);
        String lastName = name.substring(spaceIndex+1);
        System.out.println(lastName + ", " + firstName);
    }

    //method for new lines between the question
    public static void newLines(){
        System.out.println();
        System.out.println();
    }
}