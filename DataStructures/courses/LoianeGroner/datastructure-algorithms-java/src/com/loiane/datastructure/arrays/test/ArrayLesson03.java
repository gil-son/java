package com.loiane.datastructure.arrays.test;

import com.loiane.datastructure.arrays.Array;

public class ArrayLesson03 {

	public static void main(String[] args) {
		Array array = new Array(2);
	
		/* // 1 .Basic soluction
		try {
			// this method requires use with 'throws', then use inside 'try'
			array.add("element 1");
			array.add("element 2");
			array.add("element 3");
		}catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		
		// 2 .Basic soluction
		// Can create a message to validate
		array.add("element 1");
		array.add("element 2");
		array.add("element 3");
	}

}
