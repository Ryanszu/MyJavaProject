package set1;

/**
 * @author Ryan
 * @DATE 2018年1月21日
 * @REMARKS 
 */
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times = 2;
		String words = "TEST";
		printWords(times,words);
		
		paramTest("參數測試", 1,2,3);
		
		System.out.println("4和5中的最大值是:" + max(4,5));
		
		System.out.println("4.5和5.5中的最大值是" + max(4.5,5));

	}

	
	public static void printWords(int times,String words) {
		for (int i = 0 ; i < times ; i ++)
		{
			System.out.println(words);
		}
	}
	
	/**
	 * 不定长度参数测试
	 * 
	 * @param str
	 * @param nums
	 */
	public static void paramTest(String str, int...nums) {
		System.out.println("第一個參數:" + str);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	/**
	 * 
	 * 重载DEMO
	 * @param a
	 * @param b
	 * @return
	 */
	public static int max(int a,int b) {
		if(a > b)
			return a;
		else return b;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return 重载方法
	 */
	public static double max (double a,double b) {
		if(a > b)
			return a;
		else return b;
	}
	
	
}
