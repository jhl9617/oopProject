package oop.access;

public class TestClass extends java.util.Calendar{
    //�ٸ� Ŭ������ ���
    //1. �ʵ�� ���
    TestClass testClass = new TestClass();


    //2. �޼ҵ忡�� ���������� ���
    public void testMethod (DefaultSample defaultSample) {
        PublicSample publicSample;
        //abstract(�̿ϼ���) class : �߻� Ŭ����
        //��ü �� ����, ���۷��� ������ ���� �� ����
        java.util.Calendar today;
        //today = java.util.Calendar(); //��ü ���� �� ��
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
