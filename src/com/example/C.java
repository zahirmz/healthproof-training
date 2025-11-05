package com.example;

public class C extends A
{
	C()
	{
		System.out.println("default C");
	}
	C(int x){
		System.out.println("C with arguments");
		
	}

	public static void main(String[] args) {
		new C(3);
	}

}


