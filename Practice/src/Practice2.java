import java.util.Scanner;

public class Practice2 {
public static void main(String[] args) {
//	���� �� ���� �Է� ���� ��, ū ������ ���� ���� �� ���� ����ϴ� ���α׷��� ��������.
//
//	[Test case 1]
//	ù��° ������ �Է��ϼ���: 30
//	�ι�° ������ �Է��ϼ���: 20
//	30���� 20�� �� ���� 10 �Դϴ�.
//
//	[Test case 2]
//	ù��° ������ �Է��ϼ���: 20
//	�ι�° ������ �Է��ϼ���: 40
//	40���� 20�� �� ���� 20 �Դϴ�.
	
	Scanner k = new Scanner(System.in);
	
	System.out.print("ù��° ������ �Է��ϼ��� :");
	int num1 = k.nextInt();
	
	System.out.print("�ι�° ������ �Է��ϼ��� :");
	int num2 = k.nextInt();
	
//	boolean judge = num1>= num2;
//	System.out.println(judge);

	if (num1> num2) { System.out.printf("%d���� %d�� �� ���� %d �Դϴ�. ",num1,num2,num1-num2);
		}
	else {System.out.printf("%d���� %d�� �� ���� %d �Դϴ�. ",num2,num1,num2-num1);
		
	}
	
	
	
}
}
