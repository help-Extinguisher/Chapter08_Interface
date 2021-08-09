package ch08_3_example;

interface NewPrintable {
	void print(String doc);
	default void printCMYK(String doc) {
		// ★☆★☆default - 바디 {} 를 넣으면 반드시 구현하지 않아도 됨★☆★☆
		// (오버라이딩을 해도되고 안해도되고...)
	}
}


// 기존 흑백 프린터
class OldDriver implements NewPrintable {

	// 프린트만 오버라이딩됐다!!!!!
	@Override
	public void print(String doc) {
		System.out.println("[기존 흑백 프린터~!]");
		System.out.println(doc + "\n");
		
	}
	
}

// 새로운 컬러 프린터
class NewDriver implements NewPrintable {

	@Override
	public void print(String doc) {
		System.out.println("삼성 9600 프린터~~!");
		System.out.println(doc + "\n");

		
	}
	
//	default 붙은거 오버라이딩 해도 되긴 함 (아이콘에 D붙어있음)
	@Override
	public void printCMYK(String doc) {
		System.out.println("삼성 9600 컬러 프린터~~!");
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










