package ch08_1_interface;

interface RemoteControl {  // ������ �������
	// ���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �߻�޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}


public class Television implements RemoteControl {
	// �ʵ�
	private int volume;
	private String name;
	
	
	
	
	
	//turnOn() �߻� �޼ҵ��� ���� �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}
	
	//turnOff() �߻� �޼ҵ��� ���� �޼ҵ�
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}
	
	//setVolume() �߻� �޼ҵ��� ���� �޼ҵ�
	@Override
	public void setVolume (int volume) { 
		// �������̽� ����� �̿��ؼ� volume �ʵ��� ���� ����
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV���� : " + this.volume);
	}
	
}


public class Audio implements RemoteControl {
	
	

	// �ʵ�
	private int volume;
	
	//turnOn() �߻� �޼ҵ��� ���� �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	@Override
	//turnOff() �߻� �޼ҵ��� ���� �޼ҵ�
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	@Override
	//setVolume() �߻� �޼ҵ��� ���� �޼ҵ�
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio���� : " + this.volume);
}




public static class RemoteControlExample {
	
	
	public static void main(String[] args) {
		// �������̽��� ������� ���� ���
		// �� ������ ���ڱ�Ⱑ �ϼ��Ǿ�߸� �����ڵ带 �ۼ��Ҽ��ִ�.
		Television tv1 = new Television("�Ｚ");
		Television tv2 = new Television("����");
		tv1.trunOn();
		tv2.trunOn();
		
		
		// TV �ϼ��� ��ٸ��� �ʾƵ� ���� ����
		RemoteControl rc = new Television("HP");
		rc.turnOn();
		rc.turnOff();
		
		
		
		
		
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
	}

}

}
