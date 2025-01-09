package day21;

import java.io.*;

class AAA {
	public void aaa() {
		// throw new IOException();
		throw new NullPointerException();
	}
}

class BBB {
	public void bbb() {
		AAA a = new AAA();
		a.aaa();
	}
}

public class ThrowsTest {

	public static void main(String[] args)  {
		BBB b = new BBB();
		b.bbb();
	}

}
