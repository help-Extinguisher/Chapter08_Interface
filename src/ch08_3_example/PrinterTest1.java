package ch08_3_example;

public class PrinterTest1 {
	public static void main(String[] args) {
		String myDoc = "This is a report.....";
		Printable prn = null;
		
		// 삼성 프린터 출력검사
		prn = new SPrinterDirver();
		prn.print(myDoc);
		
		
		// LG 프린터 출력검사
		prn = new LPrinterDirver();
		prn.print(myDoc);
		
	}

}


// 삼성 프린터 드라이버
class SPrinterDirver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer---");
		System.out.println(doc);
		
	}
	
}


// LG 프린터 드라이버
class LPrinterDirver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From LG printer---");
		System.out.println(doc);
		
		
	}
	
}