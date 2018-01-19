package set1;

import java.util.Arrays;





public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sort Practise
			int nums[] = new int[100];
			
			for (int i = 0; i < nums.length; i++) {
				nums[i] = (int)(Math.random()*100%101);
			}
			System.out.println("排序前：");
			for (int i = 0; i < nums.length; i++) {
				if(i % 15 ==0 && i != 0)
				{
					System.out.println();
				}
				else
					System.out.printf("%4d",nums[i]);
				
				
			}
			System.out.println();
		Arrays.sort(nums);
		
		System.out.println("排序后：");
		
		for (int i = 0; i < nums.length; i++) {
			if(i % 15 ==0 && i != 0)
			{
				System.out.println();
			}
			else
				System.out.printf("%4d",nums[i]);
			
		}
		System.out.println();
		
		
		
	}

}
