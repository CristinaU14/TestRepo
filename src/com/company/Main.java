package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int studentAge[] = {24, 23, 47, 36, 35,37,31,69,29};
        String studentNames[] = {"Robert", " Silviu", "Cosmin", "Slava", "Catalin", "Sebi", "Cristina", "Cosmin2"};
        String ceva = "Ceva";
        List<Integer> numbersList = new ArrayList<>(List.of(1,2,1,1,1));


        //General.CalculateSumAndProduct(6, 7);
        //General.printArrayElements(studentAge);
        //General.printArrayElements(studentNames);
        //System.out.println(General.missingNumber(100));
        //General.calculateNewSum(20, 30);
        //System.out.println(General.generateListWithSpecificNumOfElements(20));
        System.out.println(General.calculateListSum(numbersList));
        System.out.println(General.productOfTwoNumbers(2,2));
        System.out.println(General.calculateSum(10,2));
    }
}
