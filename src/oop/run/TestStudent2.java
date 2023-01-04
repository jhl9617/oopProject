package oop.run;

import oop.encapsulation.Student;

import java.util.Scanner;

public class TestStudent2 {

    public static void main(String[] args) {
        //������ ��� �׽�Ʈ
        //Ŭ���� ��� : Ŭ������ ���۷��� ���� = new ������();

        //Student �� 3���� ������ ������
        //new �� �����Ǵ� ��ü�� �ν��Ͻ����� �ʱ�ȭ ����� 3����
        //1. �⺻������
        Student student1 = new Student();
        Student student2 = new Student(123, "wasd", 28, '��');
        Student student3 = new Student(456, "qwerty", "����", 12, 'A', 30, '��');

        student1.printInfo();
        System.out.println(student1.information());
        System.out.println(student2.information());
        System.out.println(student3.information());


        student1.setName("asdsad");
        student1.setScore(90909.9);
        student1.setNo(9999);

        student1.printInfo();

        //Ű���� �Է��� ���� �ʵ尪 ����ÿ��� setter �̿��� �� ����
        Scanner scanner = new Scanner(System.in);
        System.out.print("���� : ");
        student2.setMajor(scanner.next());
        System.out.print("���� : ");
        student2.setScore(scanner.next().charAt(0));
        System.out.print("��� : ");
        student2.setGrade(scanner.next().charAt(0));
        student2.printInfo();
    }
}
