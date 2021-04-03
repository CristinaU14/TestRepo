package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class General
{
    public static void CalculateSumAndProduct(int numberOne, int numberTwo)
    {
        int sum = numberOne + numberTwo;
        System.out.println(sum);
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



}
