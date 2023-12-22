package com.karthik.patterns;

public class Triangle_2 {
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
            triangle(row-1,0);
            System.out.println();
        }
        if(col < row) {
            triangle(row,col+1);
            System.out.print("*");
        }
    }
}
