package ch08_3_example;

// - ���ο� �÷� �������� �������� �߰��ؾ��� �� -
// Į�������Ϳ� ��� ������ ����� ������ Į�������͸� ���� ��


class SP9600CDriver implements ColorPrintable {

	@Override
	public void printCMYK(String doc) {
		System.out.println("�Ｚ 9600 Į�� ������~~!");
		System.out.println(doc + "\n");
		
	}

	@Override
	public void print(String doc) {
		System.out.println("�Ｚ 9600 ������~~!");
		System.out.println(doc + "\n");
		
	}
		
	
}


public class PrinterTest3 {
	public static void main(String[] args) {
		String myDoc = "This is a report.....";
		ColorPrintable prn = new SP9600CDriver();
		
		prn.print(myDoc);
		prn.printCMYK(myDoc);
		
	}

}
