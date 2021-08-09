package ch08_3_example;

// - 새로운 컬러 프린터의 등장으로 추가해야할 때 -
// 칼라프린터에 흑백 프린터 상속을 했으니 칼라프린터만 쓰면 됨


class SP9600CDriver implements ColorPrintable {

	@Override
	public void printCMYK(String doc) {
		System.out.println("삼성 9600 칼라 프린터~~!");
		System.out.println(doc + "\n");
		
	}

	@Override
	public void print(String doc) {
		System.out.println("삼성 9600 프린터~~!");
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
