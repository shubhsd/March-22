package Lecture_16_Revision_And_OOPS;

import java.util.Scanner;

public class ReverseWordsOfString {

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        Reading entire input as single line
        String line = scn.nextLine();
//        System.out.println(line);
//        String words[] = line.split(" ");
//        or
        String[] words = line.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
//            System.out.println(s);
            sb.append(reverse(s));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}


    //Using character array
//    Scanner sc = new Scanner(System.in);
//    String s = sc.nextLine().trim();
//    String[] ns = s.split(" ");
//    String outString = new String();
//    for(String in:ns){
//        String r=new String();
//        char[]chArray=in.toCharArray();
//        for(int i=chArray.length-1;i>=0;i--){
//          r=r+chArray[i];
//        }
//        outString=outString+r+" ";
//     }
//     System.out.print(outString.trim());