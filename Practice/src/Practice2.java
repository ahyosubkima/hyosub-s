import java.util.Scanner;

public class Practice2 {
public static void main(String[] args) {
//	정수 두 개를 입력 받은 뒤, 큰 값에서 작은 값을 뺀 값을 출력하는 프로그램을 만들어보세요.
//
//	[Test case 1]
//	첫번째 정수를 입력하세요: 30
//	두번째 정수를 입력하세요: 20
//	30에서 20를 뺀 값은 10 입니다.
//
//	[Test case 2]
//	첫번째 정수를 입력하세요: 20
//	두번째 정수를 입력하세요: 40
//	40에서 20를 뺀 값은 20 입니다.
	
	Scanner k = new Scanner(System.in);
	
	System.out.print("첫번째 정수를 입력하세요 :");
	int num1 = k.nextInt();
	
	System.out.print("두번째 정수를 입력하세요 :");
	int num2 = k.nextInt();
	
//	boolean judge = num1>= num2;
//	System.out.println(judge);

	if (num1> num2) { System.out.printf("%d에서 %d를 뺀 값은 %d 입니다. ",num1,num2,num1-num2);
		}
	else {System.out.printf("%d에서 %d를 뺀 값은 %d 입니다. ",num2,num1,num2-num1);
		
	}
	
	
	
}
}
