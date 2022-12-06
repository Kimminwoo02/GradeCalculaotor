package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GradeCalculaotrTest {
    //학점계산기 : 도메인 : 이수한 과목, 학점 계산기
    // 객체지향프로그래밍, 자료구조, 등등 --> 과목 클래스

    // 이수한 과목을 전달하여 평균학점 계산 요청 ---> 학점 계산기 ---> (학점수 + 교과목 평점 ) 의 합계 ---> 과목(코스)에 요청
    //  ---> 수강신청 총학점 수 ---> 다른 객체에게 작업 요청 -> 과목(코스)에 요청

    @DisplayName("평균학점 계산")
    @Test
    void calculateGradeTest(){
        List<Course> courses = List.of(new Course("OOP",3,"A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(new Courses(courses));
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);

    }
}
