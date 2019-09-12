package com.stackroute;

import java.util.*;

public class StudentMarks {
    public static void main(String args[]) {


        List<Integer> stuGrades = new ArrayList<Integer>();
        int number_Of_Students;
        int grades;
        Scanner input = new Scanner(System.in);
        ClassData(980, new int[]{434,898080});
        number_Of_Students = input.nextInt();
        try {
            for (int i = 0; i < number_Of_Students; i++) {
                grades = input.nextInt();
                if (grades > 0 && grades <= 100) {
                    stuGrades.add(grades);
                }
                else
                    throw new Exception();
            }
        } catch (Exception e){
            System.out.println("enter grades between 0 & 100");
        }
    }
    public static boolean ClassData(int number, int[] stuGrades){
    return false;
    }
}


