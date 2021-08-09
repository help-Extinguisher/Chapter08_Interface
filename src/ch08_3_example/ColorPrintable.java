package ch08_3_example;

// 흑백프린터 상속을 해버림
public interface ColorPrintable extends Printable { 
	void printCMYK(String doc);

}
