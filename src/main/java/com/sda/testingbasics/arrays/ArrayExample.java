package com.sda.testingbasics.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayExample {

	public static String[] removeDuplicates(String[] array) {
		Set<String> distinct = new HashSet<>();
		for (String element : array) {
			distinct.add(element);
		}
		return distinct.toArray(new String[0]);
	}
}
