package oop.run;

import oop.encapsulation.Person;

public class TestPerson {
    public static void main(String[] args) {
        //String personID, String name, int age, char gender, double height, double weight
        Person person1 = new Person("999999-888888","±è±è±è", 27,'³²',130,50);
        Person person2 = new Person("13123-231313","ÀÌÀÌÀÌ", 18,'³²',180,80);
        Person person3 = new Person("123131-221112", "¹Ú¹Ú¹Ú",52, '³²', 171, 60);

        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());

        double avgAge = (person1.getAge() + person2.getAge() + person3.getAge())/3;
        double avgWei = (person1.getWeight() + person2.getWeight() + person3.getWeight())/3;
        double avgHei = (person1.getHeight() + person2.getHeight() + person3.getHeight())/3;

        System.out.println("Æò±Õ ³ªÀÌ : "+avgAge);
        System.out.println("Æò±Õ ¹«°Ô : "+(int)(avgWei*100)/100.0);
        System.out.println("Æò±Õ Å° : "+(int)(avgHei*100)/100.0);

    }
}
