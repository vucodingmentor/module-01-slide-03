package com.vu.mainfunc;

public class MyFunction {
	
	static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		MyFunction03 myFunc03 = new MyFunction03();
//		sum(2, 3);
		myFunc03.main(args);
		
		MyFunction02 myFunc02 = new MyFunction02();
		myFunc02.main(args);
	}

}

class MyFunction03 {
	public static void main(String[] args) {
		System.out.println("Hello Trong Nhan");
	}
}
