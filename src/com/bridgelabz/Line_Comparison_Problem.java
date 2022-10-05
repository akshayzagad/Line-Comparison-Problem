package com.bridgelabz;

import java.util.Scanner;

public class Line_Comparison_Problem {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        int a1,a2,b1,b2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of line!!: x1,y1,x2,y2");
        System.out.println("Enter the co-ordinates of line!!: a1,a2,b1,b2");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        a1 = scanner.nextInt();
        b1 = scanner.nextInt();
        a2 = scanner.nextInt();
        b2 = scanner.nextInt();
       int lineOneLength= lineLenghtCal(x1,y1,x2,y2);
        int lineSecondLength= lineLenghtCal(a1,b1,a2,b2);
        System.out.println("The length of line 1 is: "+lineOneLength);
        System.out.println("The length of line 2 is: "+lineSecondLength);
        equalityCheck(lineOneLength,lineSecondLength);
    }
    static int lineLenghtCal(int x1, int x2, int y1, int y2){
    int lineLength = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    System.out.println("The length of line is: "+lineLength);
        return lineLength;
    }
    static void equalityCheck(int lineOneLength , int lineTwoLength ) {
        if(lineOneLength == lineTwoLength ) {
            System.out.println("Lines are Equal");
        }
        else if(lineOneLength > lineTwoLength){
            System.out.println("Line 1 is greater than Line 2 ");
        }
        else {
            System.out.println("Line 2 is greater than Line 1 ");
        }
    }
}
