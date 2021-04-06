package edu.tekwill.classwork.loops;

import java.util.ArrayList;

public class EnhancedForInNestedArray {
    public static void main(String[] args) {
        ArrayList<String> exam = new ArrayList<>();
        exam.add("Java");
        exam.add("Oracle");
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Basic");
        levels.add("Advanced");
        ArrayList<String> grades = new ArrayList<>();
        grades.add("Pass");
        grades.add("Fail");

        ArrayList<ArrayList<String>> nestedArray = new ArrayList<>();
        nestedArray.add(exam);
        nestedArray.add(levels);
        nestedArray.add(grades);

        for(String ex : exam){
            for(String level : levels){
                for(String grade : grades){
                }
            }

        }
    }
}
