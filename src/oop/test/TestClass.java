package oop.test;


import oop.access.PublicSample;

public class TestClass {
    //클래스 사용 1 : 필드로 사용
    private PublicSample publicSample;

    //클래스 사용 2 : 메소드 지역변수로 사용
    public void testMethod() {
        PublicSample publicSample1;
        //DefalutSample  defalutSample;     //default class : 패키지 밖에서 사용 못 함
    }
}
