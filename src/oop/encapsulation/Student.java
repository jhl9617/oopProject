package oop.encapsulation;

//class : �ڷ����� �ٸ� �������� ����(����ü) + ��������
//��ü���� 1��Ģ : ĸ��ȭ
//�ʵ带 �����(private) ó����
//private : Ŭ���� �ȿ����� ��� ����, Ŭ���� �ۿ����� ���� �Ұ���
public class Student {
    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setNo(int no) {
        this.no = no;
    }

    //field(�������) : �ڷ����� �ٸ� ������(����� �����͵�)
    //��ü(instance) �ȿ� ������� ��������
    //���������� [�����] �ڷ��� ������[ = �ʱⰪ];
    private int no;//�й�
    private String name;//�̸�
    private String major;//�����а�
    private double score;//��������
    private char grade;//�������
    private int age;//����
    private char gender;//����

    //ĸ��ȭ�� �ʵ带 �ٷ�� ����� �����ڳ� �޼ҵ带 public ó���ؼ� oop�� �ذ���
    //������ �Լ�(Constructor)
    //�����ε�(overloading, �ߺ�����) ������
    //Ŭ���� �ȿ� �̸��� ���� �����ڸ� ������ �ۼ��� ���

    //�ۼ���� : ���������� Ŭ������(�ڷ��� �Ű�����, ...) { �ʵ� �ʱ�ȭ }
    //�⺻������ : �Ű������� ���� ������
    //�Լ��̸��� �ݵ�� Ŭ������� ���ƾ���
    //��ȯ�ڷ��� ���� (return ����)
    //new �Ҷ��� ���� : ��ü ���� �Ҵ�ÿ��� �����
    //��ü���� ��������� ��ü�ȿ� �ʵ尡 ������
    // => �����Ǵ� �ʵ忡 �ʱⰪ ����� ������

    //�⺻������ : �Ű������� ���� ������
    //jvm�� �غ��� �� �ڷ����� �⺻��(default)���� �ʱ�ȭ��
    //boolean : false, char : '\u0000', ���� : 0, �Ǽ� :0.0
    //������ = null
    public Student() {
    }

    //�ʵ� ��� �ʱ�ȭ �ϴ� ������
    public Student(int no, String name, String major, double score, char grade, int age, char gender) {
        this.no = no;
        this.name = name;
        this.major = major;
        this.score = score;
        this.grade = grade;
        this.age = age;
        this.gender = gender;
    }

    //�Ű������� �ִ� ������
    //�ʵ� �Ϻθ� �ʱ�ȭ �ϴ� ������
    public Student(int no, String name, int age, char gender) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //����Լ�(Method)
    //non-static �޼ҵ忡�� this ���۷����� ������
    //static �޼ҵ忡�� this �� ����.


    public void printInfo() {
        System.out.println("�й� : " + this.no + ", �̸� :" + this.name + ", ���� : " + this.major + ", ���� : " + this.score + ", " +
                "��� : " + this.grade + ", ���� :" + this.age + ", ���� : " + this.gender);
    }

    //2. ��ü ������ ���ڿ� ��ġ�� �ؼ� ���ڿ� ����
    public String information() {
        return "�л����� [�й� : " + this.no + ", �̸� :" + this.name + ", ���� : " + this.major + ", ���� : " + this.score + ", " +
                "��� : " + this.grade + ", ���� :" + this.age + ", ���� : " + this.gender + "]";
    }
}
