//1) 필드를 정의하세요. 단, 모든 필드는 전용 멤버입니다.
//2) 모든 필드에 대한 Getter와 Setter 메소드를 작성하세요.
//3) Plane 클래스의 생성자를 중복 정의하세요. 형태는 상관 없습니다.
//4) PlaneTest라는 테스트 클래스를 만드는데 메인 메소드에서 Plane 객체를 여러개 생성하고 Getter와 Setter를 호출해 보세요.
//5) Plane 클래스에 지금까지 생성된 비행기 댓수를 나타내는 정적 변수인 planes를 추가하고 생성자에서 증가시켜 보세요.
//6) Plane 클래스에 정적 변수 planes의 값을 반환하는 정적 메소드인 getPlanes를 추가하고 main 메소드에서 호출해 보세요.

class Plane{
	private String color;
	private int weight;
	private String maker;
	private static int planes = 0;
	public Plane() {
		++planes;
	};
	
	public Plane(String color, int weight, String maker) {
		super();
		this.color = color;
		this.weight = weight;
		this.maker = maker;
		++planes;
	}
	public static int getPlanes() {
		return planes;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
	
	
}

public class PlaneTest {
public static void main(String[] args) {
	Plane a = new Plane("보라", 5000, "보잉");
	Plane b = new Plane("주황", 2000, "에어버스");
	Plane c = new Plane("노랑", 3000, "에어버스");
	
	a.setColor("파랑");
	System.out.println(a.getColor());
	System.out.println(Plane.getPlanes());
	
}
}
