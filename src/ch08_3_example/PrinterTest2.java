package ch08_3_example;

class SP204Driver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("�Ｚ 204 ����̹�!");
		System.out.println(doc + "\n");
		
	}
	
}

class LP870Driver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("���� 870 ����̹�!");
		System.out.println(doc + "\n");

		
	}
	
}



public class PrinterTest2 {
	public static void main(String[] args) {
		String myDoc = "This is a report.....";
		Printable prn = null;
		
		// �Ｚ ������ ��°˻�
		prn = new SP204Driver();
		prn.print(myDoc);
		
		
		// LG ������ ��°˻�
		prn = new LP870Driver();
		prn.print(myDoc);
		
		
	}
	

}
