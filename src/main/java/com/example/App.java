package com.example;

public class App {

    public String classifyResult(int totalMarks, int subjects) {

        if (subjects == 0) {
            return "Invalid input";
        }

        double percentage = (double) totalMarks / subjects;

        if (percentage >= 90) return "A+ PASS";
        else if (percentage >= 75) return "A PASS";
        else if (percentage >= 60) return "B PASS";
        else if (percentage >= 50) return "C PASS";
        else if (percentage >= 40) return "D PASS";
        else return "F FAIL";
    }
}
