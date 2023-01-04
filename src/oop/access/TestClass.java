package oop.access;

public class TestClass extends java.util.Calendar{
    //다른 클래스의 사용
    //1. 필드로 사용
    TestClass testClass = new TestClass();


    //2. 메소드에서 지역변수로 사용
    public void testMethod (DefaultSample defaultSample) {
        PublicSample publicSample;
        //abstract(미완성된) class : 추상 클래스
        //객체 못 만듦, 레퍼런스 변수는 만들 수 있음
        java.util.Calendar today;
        //today = java.util.Calendar(); //객체 생성 못 함
    }

    public static void main(String[] args) {

    }

    @Override
    protected void computeTime() {

    }

    @Override
    protected void computeFields() {

    }

    @Override
    public void add(int field, int amount) {

    }

    @Override
    public void roll(int field, boolean up) {

    }

    @Override
    public int getMinimum(int field) {
        return 0;
    }

    @Override
    public int getMaximum(int field) {
        return 0;
    }

    @Override
    public int getGreatestMinimum(int field) {
        return 0;
    }

    @Override
    public int getLeastMaximum(int field) {
        return 0;
    }
}
