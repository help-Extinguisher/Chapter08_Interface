package ch08_1_interface;

public class MyClass { // (에러내용) 공개 유형 MyClass는 자체 파일에 정의되어야 합니다.
	// 필드
	RemoteControl rc = new Television();
	
	// 생성자
	MyClass(){
		
	}
	
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 매개변수의 다형성
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}


}

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1)--------------------");
		
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		
		System.out.println("2)-------------------");
		
		
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)------------------");
		
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)----------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}

}
