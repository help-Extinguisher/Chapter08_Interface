package ch08_1_interface;

interface RemoteControl {  // 리모콘 만든거임
	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}


public class Television implements RemoteControl {
	// 필드
	private int volume;
	private String name;
	
	
	
	
	
	//turnOn() 추상 메소드의 실제 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	
	//turnOff() 추상 메소드의 실제 메소드
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	
	//setVolume() 추상 메소드의 실제 메소드
	@Override
	public void setVolume (int volume) { 
		// 인터페이스 상수를 이용해서 volume 필드의 값을 제한
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨 : " + this.volume);
	}
	
}


public class Audio implements RemoteControl {
	
	

	// 필드
	private int volume;
	
	//turnOn() 추상 메소드의 실제 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	//turnOff() 추상 메소드의 실제 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	@Override
	//setVolume() 추상 메소드의 실제 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio볼륨 : " + this.volume);
}




public static class RemoteControlExample {
	
	
	public static void main(String[] args) {
		// 인터페이스를 사용하지 않을 경우
		// 각 제조사 전자기기가 완성되어야만 실행코드를 작성할수있다.
		Television tv1 = new Television("삼성");
		Television tv2 = new Television("엘지");
		tv1.trunOn();
		tv2.trunOn();
		
		
		// TV 완성을 기다리지 않아도 구현 가능
		RemoteControl rc = new Television("HP");
		rc.turnOn();
		rc.turnOff();
		
		
		
		
		
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
	}

}

}
