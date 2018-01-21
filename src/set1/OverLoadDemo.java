package set1;

/**
 * @author Ryan
 * @DATE 2018年1月21日
 * @REMARKS 重载Demo
 */
public class OverLoadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printLog("测试日志", "2", "INFO");
		printLog("测试1","2");
		printLog("测试2");

	}
	
	
	public static void printLog(String msg,String lev, String type) {
		System.out.println("【" + type + "】【" + lev + "】" + msg);
	}
	
	public static void printLog(String msg, String lev) {
		printLog(msg, lev, "DEFAULT");
	}
	
	
	public static void printLog(String msg) {
		printLog(msg, "1", "DEFAULT");
	}
	
	
	

}
