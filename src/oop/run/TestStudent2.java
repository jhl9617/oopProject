package oop.run;

import oop.encapsulation.Student;

import java.util.Scanner;

public class TestStudent2 {

    public static void main(String[] args) {
        //생성자 사용 테스트
        //클래스 사용 : 클래스명 레퍼런스 변수 = new 생성자();

        //Student 가 3개의 생성자 제공함
        //new 로 생성되는 객체의 인스턴스변수 초기화 방법이 3가지
        //1. 기본생성자
        Student student1 = new Student();
        Student student2 = new Student(123, "wasd", 28, '남');
        Student student3 = new Student(456, "qwerty", "정보", 12, 'A', 30, '남');

        student1.printInfo();
        System.out.println(student1.information());
        System.out.println(student2.information());
        System.out.println(student3.information());


        student1.setName("asdsad");
        student1.setScore(90909.9);
        student1.setNo(9999);

        student1.printInfo();

        //키보드 입력을 통한 필드값 변경시에도 setter 이용할 수 있음
        Scanner scanner = new Scanner(System.in);
        System.out.print("전공 : ");
        student2.setMajor(scanner.next());
        System.out.print("학점 : ");
        student2.setScore(scanner.next().charAt(0));
        System.out.print("등급 : ");
        student2.setGrade(scanner.next().charAt(0));
        student2.printInfo();
    }
}
