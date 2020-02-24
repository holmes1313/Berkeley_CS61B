public class ArgsSum {
	public static void main(String[] args) {
		int sum = 0;
		for (String n: args) {
			sum = sum + Integer.parseInt(n);
		}
		System.out.println(sum);
	}
}