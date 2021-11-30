package com.calculator;

public class MainApplication
{
    public static void main(String args[])
    {
        int add= BasicCalculator.addition();
        int sub= BasicCalculator.substraction();
        int mul= BasicCalculator.multiplication();
        int div= BasicCalculator.division();
        System.out.println("Adddition of both numbers are: "+add);
        System.out.println("Substraction of both numbers are: "+sub);
        System.out.println("Multiplication of both numbers are: "+mul);
        System.out.println("Division of both numbers are: "+div);
    }
}
