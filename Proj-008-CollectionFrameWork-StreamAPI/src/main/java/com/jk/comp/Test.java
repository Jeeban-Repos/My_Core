package com.jk.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = null;
		
		list = new ArrayList<Integer>();
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(15);
		list.add(12);
		Collections.sort(list);
		list.stream().forEach(System.out::println);
	}
}
