package Lecture_15_Strings;

import java.util.Locale;
import java.util.Scanner;

public class StringClassDemo {

    public static void stringBasics() {
        //        Character arrays
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        arr[0] = 'b'; //Character arrays can be modified
        char[] name = new char[20];

        name[0] = 'b';
        System.out.println("Name " + name);
        System.out.println(arr);

//        Strings
        String s = "Hello";
        s = "apple";
        System.out.println(s);
//        s[0] = 'b'; This is not supported
        System.out.println(s.length()); // Length of string
        System.out.println(s.charAt(0)); //Tells character at particular index

//    You can also get a copy of char array from string
//    Conversion : string <==> char array
//    Character array to string
        char[] arrch = {'a', 'b', 'c', 's', 't'};
        String a = new String(arrch);
        arrch[0] = 'x';
        System.out.println(arrch);
        System.out.println(a);

//        String to char arr
        String b = "hello";
        char[] bArr = b.toCharArray();
        System.out.println("b " + b);
        System.out.println(bArr);
        bArr[0] = 'd';
        System.out.println(bArr);
//        converting back to string
        b = new String(bArr);
        System.out.println(b);
    }

    public static void stringComparison() {
        //        string pool was invented to optimise storage and remove redundant values
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2);
        System.out.println("s1 equals s2" + (s1.equals(s2)));

        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a == b);
        System.out.println("a equals b" + (a.equals(b)));
    }

    public static void playWithUpperCase() {
        String s = "I love reading books"; //convert this to uppercase
//        suppose this was char array
//        char arr[] = "I love reading books"; //We have to check what is the ascii value of l and what is the difference between
//        ascii value of l and L with String we can directly use s.toUppercase()
        System.out.println(s.toUpperCase());
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
    }

    public static void readALetter() {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
//        .next() gives first token from the string input
        System.out.println(s);
        char letter = s.charAt(2);
        System.out.println(letter);
    }

    public static void readCompleteString() {
        Scanner scn = new Scanner(System.in);
        String firstName = scn.next(); //reads first word/token until space found
        String lastName = scn.next(); // reads token/word
        String line = scn.nextLine();
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(line);
        System.out.println(line.trim());
        System.out.println(line.strip());
    }

    public static void largestString() {
        // read a number N, and then read N lines
//        Print largest strings out of N strings that have been input
//        eg: N = 3
//        apple
//        mango shake - largest string
//        papaya
//        guava juice
//        something
//        Ans --- avoid storage, just take input one by one and compare with largest
//        You only need to store current string at a time and largest string at a time

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine(); //to discard the first backslash n

        int largest = 0;
        String largestString = "";
        for (int i = 1; i <= n; i++) {
//            /it will treat enter key press as input
//            to avoid this accept new line as input
            String current = scn.nextLine(); //in first line enter was detected as enter
            if (current.length() > largest) {
                largest = current.length();
                largestString = current;
            }
        }
        System.out.println("Largest string is " + largestString);
    }

    public static void filterImages() {
        String files[] = {"xyz.png", "ds1.jpg", "dsc.pdf", "ds3.jpg", "myNotes.pdf"};
//        Find out the image files
        for (String f : files) {
            if (f.endsWith(".png") || f.endsWith(".jpg")) {
                System.out.println("Found an image : " + f);
            }
        }
    }

    //    Given a string, find index of a given word inside that string
    public static void findLocation() {
        String doc = "We are learning java, java has many concepts, java is powerful";
//        Find location where word java is present
        String word = "java";
        int idx = doc.indexOf(word);
        while (idx != -1) {
            System.out.println(idx);
            idx = doc.indexOf(word, idx + 1);
        }
    }

    public static void main(String[] args) {
        String juice = "I want apple juice";
        System.out.println(juice.contains("apple"));
        System.out.println(juice.contains("mango"));
        findLocation();
    }
}
