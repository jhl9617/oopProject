package oop.run;

import oop.encapsulation.Student;

public class TestStudent3 {
    public static void main(String[] args) {
        //getters test

        //��� �ʵ尪 �ʱ�ȭ �ϴ� ������ ���
        //�л� 3�� ���� ��ü ����

        Student s1 = new Student(991201, "��ö��","asd", 22.0,'A',22,'��');
        Student s2 = new Student(991201, "��ö��","asd", 22.0,'A',22,'��');
        Student s3 = new Student(991201, "��ö��","asd", 22.0,'A',22,'��');

        //3���� ���� ���
        double avgScore = (s1.getScore() + s2.getScore() + s3.getScore()) / 3.;

        //������ ��� ��� ���
        int avgAge = (s1.getAge() + s2.getAge() + s3.getAge()) / 3;

        System.out.println("�л� ���� ��� :"+avgScore);
        System.out.println("�л� ���� ��� :"+avgAge);


    }
}

