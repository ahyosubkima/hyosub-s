import java.util.Scanner;

// 메트로폴리스의 기준은 아래 두 조건 중 하나를 만족해야합니다.
//
//1. 한 나라의 수도이고 인구가 100만명 이상이어야한다.
//2. 부자가 50만명 이상이어야 한다.
//
//이를 바탕으로
//
//수도입니까?(수도:0, 수도 아님:1)
//인구(단위 : 만)
//부자의 수(단위 : 만)
//을 입력했을때
//
//메트로폴리스 여부를 true나 false로 알려주는 프로그램을 작성하세요.
public class Pratice1 {
public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	
	System.out.println("수도입니까?(수도:0, 수도 아님:1)");
	int sudo = k.nextInt();
	
	//boolean check = sudo==0;
	//System.out.println(check);
	System.out.println("인구수를 입력하세요.(단위 : 만)");
	int saramsu = k.nextInt();

	System.out.println("부자의 수를 입력하세요.(단위 : 만)");
	int rich = k.nextInt();

	if (sudo == 0 && saramsu >= 100 || rich >= 50) {System.out.println("메트로폴리스여부:true");
		
	}
	else {System.out.println("메트로폴리스여부:false");
		
	}



}
}

