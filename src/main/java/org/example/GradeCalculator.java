package org.example;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    public double calculateGrade() {
        double totalMultipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();
        double averageGrade = totalMultipliedCreditAndCourseGrade / totalCompletedCredit;

        return (averageGrade/totalCompletedCredit);
    }
}