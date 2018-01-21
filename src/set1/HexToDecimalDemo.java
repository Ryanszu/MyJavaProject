package set1;

import java.util.Scanner;

/**
 * @author Ryan
 * @DATE 2018年1月21日
 * @REMARKS 
 */
public class HexToDecimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整形数字");
		int decNum = input.nextInt();
		
		String Hex = Integer.toHexString(decNum);
		
		System.out.println("对应16进制为" + Hex);
		
		input.close();

	}

}
