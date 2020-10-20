//10-5-20 and 10/7/20
/*
Emily Hu
testing packages and classes
String is an array of characters
Array: is a collection like a post office box
|a|b|t|g| | |
 0 1 2 3 4 5
 Array[1] --> b
10/5/2020
 */

import java.text.DecimalFormat; //specific import
import java.util.*; //import all the classes of the package
public class TestingPackages {

    public static void main(String[] args) {

//        String s1 = new String("Hello ");
//        String s2 = "there"; //String does not require "new" to create it
//        String s3 = s1 + s2; //"+" means concatenation
//        System.out.println(s3);
//
//        s3 += "!";
//        System.out.println(s3);
//
//        int len = s3.length();
//        System.out.println("the len = " + len);
//
//        int indexNum = s3.indexOf(' ');
//        System.out.println(indexNum);
//
//        String lastWord = s3.substring(indexNum+1);
//        System.out.println(lastWord); //from the number to the end
//
//        lastWord = s3.substring(indexNum+1, len-1); //beginning is included, the end is excluded
//        System.out.println(lastWord);
//
//        //10-7-20
//        String formalName = "Hu, Emily";
//        int indexOfComma = formalName.indexOf(',');
//        String lastName = formalName.substring(0,indexOfComma);
//        String firstName = formalName.substring(indexOfComma+2);
//        System.out.println("My name is " + firstName + lastName);

        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your name:");
//        String name = input.next(); //this one takes only one word
//        System.out.println(name);
//        name = input.next();
        System.out.print("Please enter your name:");
        String name = input.nextLine(); //this one will take anything until you press return
        System.out.println(name);
        System.out.print("How many games do you want to play:");
        int games = input.nextInt();
        System.out.println("Your number is " + games);

        //10/15/20
        int num4 = (int)(Math.random()*100);
        System.out.println("The random number is = " + num4);
    }
}
