package ch08_1_interface;

interface Searchable {
	void search(String url);
}



class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public SmartTelevision(String string) {
		this.name
	}

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨 : " + this.volume);
	}
	
	@Override
	public void search(String url) {
		System.out.println(this.name + url + " 을 검색합니다.");
	}
}

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision sTv = new SmartTelevision("SAMSUNG Smart TV");
		
		RemoteControl rc = sTv;
		Searchable searchable = sTv;
		rc.turnOn();
		
		Searchable sc = sTv;
		sc.search("www.google.com");
		
	}

}
