package ch08_2_polymorphism;

public class Bus_ implements Vehicle_ {
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
	
	public void checkFare() {
		System.out.println("���� ����� üũ�մϴ�.");
	}

}
