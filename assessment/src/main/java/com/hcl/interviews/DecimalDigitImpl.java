package com.hcl.interviews;

import java.util.ArrayList;
import java.util.List;

public class DecimalDigitImpl implements DecimalDigit{

	@Override
	public int[] getDecimalDigit(int inp) {
		if (inp < 0) {
			return new int[]{};
		}
		List<Integer> list = new ArrayList<>();
		int i = 0;
		int d = 0;
		int y = 0;
		while (inp > 10) {
			d = inp % 10;   // reminder would be digit place
			inp = inp / 10;  //dividing the number by 10
			y = d * (int) Math.pow(10, i); // multiply each digit with its decimal position
			if (y > 0) {
				list.add(y);
			}
			i++;
		}
		//after the above loop close inp would less than 10 value
		y = inp * (int) Math.pow(10, i);  //
		if (y > 0) {
			list.add(y);
		}
		list.sort((p1, p2) -> p2.compareTo(p1));//O(nlogn) time sorting to make descending order
		int[] arr = new int[list.size()];
		for (int j = 0; j < list.size(); j++) {
			arr[j] = list.get(j);
		}
		return arr;
	}
		             
}
