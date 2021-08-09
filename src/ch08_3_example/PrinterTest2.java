package ch08_3_example;

class SP204Driver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("삼성 204 드라이버!");
		System.out.println(doc + "\n");
		
	}
	
}

class LP870Driver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("엘지 870 드라이버!");
		System.out.println(doc + "\n");

		
	}
	
}



public class PrinterTest2 {
	public static void main(String[] args) {
		String myDoc = "This is a report.....";
		Printable prn = null;
		
		// 삼성 프린터 출력검사
		prn = new SP204Driver();
		prn.print(myDoc);
		
		
		// LG 프린터 출력검사
		prn = new LP870Driver();
		prn.print(myDoc);
		
		
	}
	

}
