public class PracticeProblem {

	public static void main(String args[]) {
	}
	
	public static boolean isEven(int num){
	return (num % 2 == 0);
	}

	public static boolean isOdd(int num){
	return (num % 2 != 0);
	}

	public static boolean isPositive(int num){
	return (num > 0);
	}

	public static boolean isNegative(int num){
	return (num < 0);
	}

	public static int combinedLength(String str1, String str2){
	return (str1.length() + str2.length());
	}
}
