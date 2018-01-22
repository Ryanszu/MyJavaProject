package set1;

import java.util.Scanner;

/**
 * 
 * 打印日历
 * 
 * @author Ryan
 *
 */
public class PrintCalendarDemo {
	
	private static int year = Integer.MIN_VALUE;
	private static int month = Integer.MIN_VALUE;
	private static int[] daysofMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static String[] daysofWeek = {"Mon","Tues","Wed","Thur","Fri","Sat","Sun"};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PrintCalendar();

	}
	
	
	public static void PrintCalendar() {
		/**
		 * 1.用户输入年份、月份
		 * 2.计算1900-01-01到输入月份的总天数
		 * 3.打印年份月份
		 * 4.根据某月1日是星期几，打印月历
		 * 
		 * 
		 * */	
		GetInput();
		
		
//		用户输入年份月份到1900-01-01的总天数
		int sum =0;
		
		sum += GetDaysOfYears();
		sum += GetDaysOfMonths();
		sum++;
		
//		System.out.println(sum);
		PrintTitle();
	
		PrintBody(sum%7);
		
//		System.out.println(sum);
		
	}
	
	
	public static void PrintBody(int dayOfWeek ) {
		int sepCount = dayOfWeek -1;
		if(dayOfWeek == 0)
			sepCount = 0;
		for (int i = 0; i < sepCount; i++) {
			System.out.print("\t");
			
		}
		
		for (int i = 0; i < daysofMonth[month -1]; i++) {
			System.out.print(i+1);
			if((dayOfWeek + i) % 7 == 0) {
				System.out.println();
			}
			else {
				System.out.print("\t");
			}
			
		}
		
		
	}
	
	public static void PrintTitle() {
		System.out.print("\t\t" + year + "年" + month + "月\n");
		for (int i = 0; i < daysofWeek.length; i++) {
			System.out.print(daysofWeek[i] + "\t");
		}
		System.out.println();
	}
	
	
	public static int GetDaysOfMonths() {
		int sum = 0;
		for (int i = 0; i < month - 1; i++) {
			sum += daysofMonth[i];
			
		}
		
		if(isLeapYear(year))
			sum ++;
		
		return sum;
	}
	
	public static int GetDaysOfYears() {
		int sum = 0;
		for (int i = 1900; i < year; i++) {
			sum += 365;
			if (isLeapYear(i)) {
				sum ++;
				
			}
		}
		return sum;
	}
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || year % 4 ==0 && year % 100 != 0; 
	}
	
	
	public static void GetInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份：");
		year = input.nextInt();
		System.out.println("请输入月份：");
		month = input.nextInt();
		if (year < 1900 || month >12 || month <1) {
			System.out.println("输入的年份/月份错误。");
			GetInput();
		}
		input.close();
		
		input = null;
	}

}
