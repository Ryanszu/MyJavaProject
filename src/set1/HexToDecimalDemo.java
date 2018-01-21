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
		
		String Hex = DecToHex(decNum);
		
		System.out.println("对应16进制为" + Hex);
		
		input.close();

	}
	
	/**
	 * @param decNum 整形变量
	 * @return String形式返回16进制值
	 */
	private static String DecToHex (int decNum) {
		String Hex = Integer.toHexString(decNum);
		return Hex;
	}

}


