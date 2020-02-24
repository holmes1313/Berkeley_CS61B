public class test1 {
	static int[] a = {1,2,3};
	
	public static void changeFirstElement(int[] i) {
		i[0] = 0;
		System.out.println(a[0]);
		//return input;
	}
	
	public static void main(String[] args) {
		//changeFirstElement(a);
		System.out.println(java.util.Arrays.toString(a));
		System.out.println(test1.a[0]);	
	}
	
	
}