package oop.run;

import oop.encapsulation.Person;

public class TestPerson {
    public static void main(String[] args) {
        //String personID, String name, int age, char gender, double height, double weight
        Person person1 = new Person("999999-888888","����", 27,'��',130,50);
        Person person2 = new Person("13123-231313","������", 18,'��',180,80);
        Person person3 = new Person("123131-221112", "�ڹڹ�",52, '��', 171, 60);

        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());

        double avgAge = (person1.getAge() + person2.getAge() + person3.getAge())/3;
        double avgWei = (person1.getWeight() + person2.getWeight() + person3.getWeight())/3;
        double avgHei = (person1.getHeight() + person2.getHeight() + person3.getHeight())/3;

        System.out.println("��� ���� : "+avgAge);
        System.out.println("��� ���� : "+(int)(avgWei*100)/100.0);
        System.out.println("��� Ű : "+(int)(avgHei*100)/100.0);

    }
}
