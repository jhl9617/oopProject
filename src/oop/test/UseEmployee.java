package oop.test;

import oop.member.Employee;

import java.util.Scanner;

public class UseEmployee {

    public void testMethod() {
        //public class: ��Ű�� �ۿ����� import �ϸ� ��� ����
        Employee employee = new Employee();
        //�Ҵ�� Ŭ������ ��ü����(�ν��Ͻ�,instance) ���� �ʵ� == �ν��Ͻ� ����
        //���۷���(�ּ�)�� �̿��� �ʵ� ���� Ȯ��
        //�ʵ尡 default �����̸� ���� ��Ű�� ���� �ٸ� Ŭ�������� ���� ����
        //�ּ�.�ʵ�� ��� ����
        //private �ʵ�� Ŭ���� �ۿ��� ��� �Ұ�����
        //employee.empId = "s100";
        //employee.empName = "ȫ�浿";
        //protected �ʵ�� ����� �� �� ��� default�� ����
        //employee.empNo = "881234-1234556";
        //public �ʵ�� ��Ű�� ��/��, Ŭ���� ��/�� ��� ���� ����
        employee.phone = "010-1234-2345";
        //default �ʵ� : ��Ű�� �� ��� �Ұ���
        //employee.salary = 5600000;
        //System.out.println("��� : "+employee.empId);
        //System.out.println("�̸� : "+employee.empName);
    }
}
