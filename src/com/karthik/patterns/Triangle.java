package com.karthik.patterns;

public class Triangle {
    public static void main(String[] args) {
        triangle(4,0);

    }
    public static void triangle(int row,int col)
    {
        if(row < 1)
        {
            return;
        }
        if(col == row)
        {
            System.out.println();
            triangle(row-1,0);
        }
        if(col < row) {
            System.out.print("*");
            triangle(row,col+1);
        }
    }
}
