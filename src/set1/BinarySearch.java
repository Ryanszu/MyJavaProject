package set1;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int[] array = {1,2,4,6,10,15,20};
		System.out.println("请输入要查找的值");
		int searchNum = input.nextInt();
		boolean isFind = false;
		int low = 0;
		int high = array.length - 1;
		
		while (high >= low) {
			int mid = (high + low)/2; 
			if (searchNum < array[mid]) {
				high = mid - 1;
			}
			else if (searchNum > array[mid]) {
				low = mid + 1;
			}
			else {
				System.out.println("找到数字。下标为"  + mid);
				isFind = true;
				break;
			}
	
		}
		if(!isFind)
			System.out.println("DATA NOT FOUND");
		Arrays.binarySearch(array, searchNum);
		input.close();
	}
}