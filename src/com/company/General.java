package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class General
{
    public static int calculateSum(int numberOne, int numberTwo)
    {
        return numberOne + numberTwo;
    }

    public int listLenght(int array [])
    {
        return array.length;
    }

    public static void printArrayElements(int array [])
    {
        for (int i = 0 ; i < array.length ; i++)
        {
            System.out.println("Student number:" + (i + 1) + ": " + array[i]);
        }
    }

    public static void printArrayElements(String array []) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Student number:" + (i + 1) + ": " + array[i]);
        }
    }


    public static int missingNumber (int number)
    {
        List<Integer> numberList = new ArrayList<>();
        int totalSum = 0;
        for (int i = 0; i<= 100; i++){
            numberList.add(i);
            totalSum = i + totalSum;
        }
        return totalSum;
    }

    public static int calculateNewSum(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }

    //Returns a list with a specific number of elements.
    public static List<Integer> generateListWithSpecificNumOfElements(int number){
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            listOfNumbers.add(i);
        }
        return  listOfNumbers;
    }
    
    //Calculates the sum of a list elements.
    public static int calculateListSum(List<Integer> givenList)
    {
        int sum = 0;
        for (int i: givenList) {
            sum = sum + i;
        }
        return sum;
    }

    //Returns the product of two integer numbers
    public static int productOfTwoNumbers (int a, int b)
    {
        return a * b;
    }
}
