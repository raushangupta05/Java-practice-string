package com.spider.sort;

import java.util.Arrays;

public class SortArrayInDesendingOrder {

	public static void main(String[] args) {
		int arr[] = { 7, 4, 2, 8, 11, 58, 52 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(arr));
	}

}
