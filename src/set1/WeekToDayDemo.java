package set1;

import java.util.Scanner;

/**
 * @author Ryan
 *
 */
public class WeekToDayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入今天是星期几");
		Scanner Input = new Scanner(System.in);
		int dayOfWeek = Input.nextInt();
		
		if(ShowDayOfWeekCN(dayOfWeek) != 1)
			System.out.println("输入错误");
		
		
		if(ShowDayOfWeekEN(dayOfWeek) != 1)
			System.out.println("输入错误");
		
		Input.close();

		
	}
	
	
	/**中文返回星期几
	 * @param dayOfWeek
	 * @return
	 */
	public static int ShowDayOfWeekCN (int dayOfWeek) {
		String [] weekdays= {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		
		if (dayOfWeek > 0 && dayOfWeek <8) {
			
			System.out.println(weekdays[dayOfWeek - 1]);
			return 1;
		}
		else
			return -1;
		
	}
	
	
	
	
	/**英文返回星期几
	 * @param dayOfWeek
	 * @return
	 */
	public static int ShowDayOfWeekEN (int dayOfWeek) {
		String [] weekdays= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Dunday"};
		
		if (dayOfWeek > 0 && dayOfWeek <8) {
			
			System.out.println(weekdays[dayOfWeek - 1]);
			return 1;
		}
		else
			return -1;
		
	}

	

}
