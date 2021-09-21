//1) �ʵ带 �����ϼ���. ��, ��� �ʵ�� ���� ����Դϴ�.
//2) ��� �ʵ忡 ���� Getter�� Setter �޼ҵ带 �ۼ��ϼ���.
//3) Plane Ŭ������ �����ڸ� �ߺ� �����ϼ���. ���´� ��� �����ϴ�.
//4) PlaneTest��� �׽�Ʈ Ŭ������ ����µ� ���� �޼ҵ忡�� Plane ��ü�� ������ �����ϰ� Getter�� Setter�� ȣ���� ������.
//5) Plane Ŭ������ ���ݱ��� ������ ����� ����� ��Ÿ���� ���� ������ planes�� �߰��ϰ� �����ڿ��� �������� ������.
//6) Plane Ŭ������ ���� ���� planes�� ���� ��ȯ�ϴ� ���� �޼ҵ��� getPlanes�� �߰��ϰ� main �޼ҵ忡�� ȣ���� ������.

class Plane{
	private String color;
	private int weight;
	private String maker;
	private static int planes = 0;
	public Plane() {
		
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
	Plane a = new Plane("����", 5000, "����");
	Plane b = new Plane("��Ȳ", 2000, "�������");
	Plane c = new Plane("���", 3000, "�������");
	
	a.setColor("�Ķ�");
	System.out.println(a.getColor());
	System.out.println(Plane.getPlanes());
	
}
}
