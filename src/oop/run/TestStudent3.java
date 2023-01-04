package oop.run;

import oop.encapsulation.Student;

public class TestStudent3 {
    public static void main(String[] args) {
        //getters test

        //모든 필드값 초기화 하는 생성자 사용
        //학생 3명에 대한 객체 생성

        Student s1 = new Student(991201, "김철수","asd", 22.0,'A',22,'남');
        Student s2 = new Student(991201, "김철수","asd", 22.0,'A',22,'남');
        Student s3 = new Student(991201, "김철수","asd", 22.0,'A',22,'남');

        //3명의 학점 평균
        double avgScore = (s1.getScore() + s2.getScore() + s3.getScore()) / 3.;

        //나이의 평균 계산 출력
        int avgAge = (s1.getAge() + s2.getAge() + s3.getAge()) / 3;

        System.out.println("학생 점수 평균 :"+avgScore);
        System.out.println("학생 나이 평균 :"+avgAge);


    }
}

