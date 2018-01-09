package set1;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times = 2;
		String words = "TEST";
		printWords(times,words);

	}

	
	public static void printWords(int times,String words) {
		for (int i = 0 ; i < times ; i ++)
		{
			System.out.println(words);
		}
	}
}
