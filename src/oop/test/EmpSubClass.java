package oop.test;

import oop.member.Employee;

public class EmpSubClass extends Employee {

    public void subMethod() {
        //�θ��� public, protected ����� �ļ��� ��� ������
        //protected �ʵ�� ��ӹ��� �ļ� �ȿ����� ��� ����
        //�ּ�.�ʵ��
        this.phone = "010-1111-2345"; // public
        this.empNo = "888888-7766554";  //protected
        //this.marriage = 'N';    //default(package private)
        //this.empId = "s200";    //private
    }
}
