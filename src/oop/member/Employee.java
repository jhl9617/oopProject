package oop.member;


//���� ���� ����� Ŭ����
//Ŭ���� : �ڷ����� �ٸ� �������� ����(����ü) + �������ѱ��(���ȱ��)
//����ü : �ڷ����� �ٸ� �������� ���� ���� �Ҵ��� ������(�迭�� ����)
//Ŭ������ ���� : ������ ��ȣ�� ������ => ĸ��ȭ(Encapsulation)
public class Employee{
    //������� : field
    //�ڷ����� �ٸ� ������ + ĸ��ȭ : oop
    //���������� [�����] �ڷ��� ������[= �ʱⰪ];
    //���������� [�����] Ŭ������ ���۷���[= new ������()];
    private String empId;   //���
    private String empName; //�̸�
    protected String empNo;   //�ֹι�ȣ
    public String phone;   //��ȭ��ȣ
    String job;//����
    String dept;//�μ�
    int salary;//�޿�
    double bonusPct;//���ʽ�����Ʈ
    char marriage;//��ȥ����(��ȥ:Y, ��ȥ:N)

    public void testMethod() {
        //�ּ�.�ʵ��
        this.empId = "s333";    //private : Ŭ���� �ȿ����� ���
        empNo = "jj";
    }

    //�������Լ� : Constructor

    //����Լ� : Method
}
