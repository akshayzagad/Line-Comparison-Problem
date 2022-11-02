package com.bridgelabz;

import java.util.Scanner;

public class Point {
    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getPoints() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X : ");
        x = sc.nextInt();
        System.out.println("Enter Y : ");
        y = sc.nextInt();
    }
}
