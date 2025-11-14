package com.filehandling;

import java.util.Arrays;
import java.util.*;
import java.util.function.*;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(3,1,5,6,2,8);
		Consumer<Integer> c=new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("Data "+t);
			}
		};
		l.forEach(c);
		l.forEach(new MyObject());
	}

}
