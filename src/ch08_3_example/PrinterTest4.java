package ch08_3_example;

interface NewPrintable {
	void print(String doc);
	default void printCMYK(String doc) {
		// �ڡ١ڡ�default - �ٵ� {} �� ������ �ݵ�� �������� �ʾƵ� �ʡڡ١ڡ�
		// (�������̵��� �ص��ǰ� ���ص��ǰ�...)
	}
}


// ���� ��� ������
class OldDriver implements NewPrintable {

	// ����Ʈ�� �������̵��ƴ�!!!!!
	@Override
	public void print(String doc) {
		System.out.println("[���� ��� ������~!]");
		System.out.println(doc + "\n");
		
	}
	
}

// ���ο� �÷� ������
class NewDriver implements NewPrintable {

	@Override
	public void print(String doc) {
		System.out.println("�Ｚ 9600 ������~~!");
		System.out.println(doc + "\n");

		
	}
	
//	default ������ �������̵� �ص� �Ǳ� �� (�����ܿ� D�پ�����)
	@Override
	public void printCMYK(String doc) {
		System.out.println("�Ｚ 9600 �÷� ������~~!");
		System.out.println(doc + "\n");
	}
	
}

public class PrinterTest4 {
	public static void main(String[] args) {
		String myDoc = "This is a report.....";
		NewPrintable prn;
		
		prn = new OldDriver();
		prn.print(myDoc);
		
		prn = new NewDriver();
		prn.printCMYK(myDoc);
	}

}










