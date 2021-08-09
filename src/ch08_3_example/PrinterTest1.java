package ch08_3_example;

public class PrinterTest1 {
	public static void main(String[] args) {
		String myDoc = "This is a report.....";
		Printable prn = null;
		
		// �Ｚ ������ ��°˻�
		prn = new SPrinterDirver();
		prn.print(myDoc);
		
		
		// LG ������ ��°˻�
		prn = new LPrinterDirver();
		prn.print(myDoc);
		
	}

}


// �Ｚ ������ ����̹�
class SPrinterDirver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer---");
		System.out.println(doc);
		
	}
	
}


// LG ������ ����̹�
class LPrinterDirver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("From LG printer---");
		System.out.println(doc);
		
		
	}
	
}