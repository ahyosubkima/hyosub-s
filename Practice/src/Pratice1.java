import java.util.Scanner;

// ��Ʈ���������� ������ �Ʒ� �� ���� �� �ϳ��� �����ؾ��մϴ�.
//
//1. �� ������ �����̰� �α��� 100���� �̻��̾���Ѵ�.
//2. ���ڰ� 50���� �̻��̾�� �Ѵ�.
//
//�̸� ��������
//
//�����Դϱ�?(����:0, ���� �ƴ�:1)
//�α�(���� : ��)
//������ ��(���� : ��)
//�� �Է�������
//
//��Ʈ�������� ���θ� true�� false�� �˷��ִ� ���α׷��� �ۼ��ϼ���.
public class Pratice1 {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	
	System.out.println("�����Դϱ�?(����:0, ���� �ƴ�:1)");
	int sudo = k.nextInt();
	
	//boolean check = sudo==0;
	//System.out.println(check);
	System.out.println("�α����� �Է��ϼ���.(���� : ��)");
	int saramsu = k.nextInt();

	System.out.println("������ ���� �Է��ϼ���.(���� : ��)");
	int rich = k.nextInt();

	if (sudo == 0 && saramsu >= 100 || rich >= 50) {System.out.println("��Ʈ������������:true");
		
	}
	else {System.out.println("��Ʈ������������:false");
		
	}



}
}

