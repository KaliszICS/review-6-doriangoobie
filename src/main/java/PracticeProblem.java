public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static int sum(int x, int y) {
		int result = x + y;
		return result;
	}

	public static int difference(int a, int b) {
		int result = a - b;
		return result;
	}

	public static double product(double c, double d) {
		double result = c * d;
		return result;
	}

 	public static String removeFirst(String e) {
		String result = e.substring(1);
		return result;
	}

	public static int combinedLength(String f, String g) {
		int result = f.length() + g.length();
		return result;
	}
	public static boolean isEven(int h) {
		Boolean result = h % 2 == 0;
		return result;
	}
	public static boolean isOdd(int i) {
		boolean result = i % 2 != 0;
		return result;
	}
	public static boolean isPositive(int j) {
		boolean result = j > 0;
		return result;
	}

	public static boolean isNegative(int k) {
		boolean result = k < 0;
		return result;
	}
	
}