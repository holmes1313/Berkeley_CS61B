public class Dog {
	/** instance variable*/
	public int weightInPounds;
	/** static variable*/
	public static String chineseName = "Gou";
	
	/** One integer constructor for dogs.*/
	public Dog(int w) {
		weightInPounds = w;
	}
	
	/**Non-static method aka instance method.
	If the method needs to use 'my instance variable', the method shoudl be non-static.*/
	public void makeNoise() {
		if (weightInPounds < 10) {
			System.out.println("yip!");
		} else if (weightInPounds < 30) {
			System.out.println("bark!");
		} else {
			System.out.println("wooooof!");
		}
	}
	
	/** static method*/
	public static Dog maxDog(Dog d1, Dog d2) {
		if (d1.weightInPounds > d2.weightInPounds) {
			return d1;
		}
		return d2;
	}
	
	/** instance method*/
	public Dog maxDog(Dog d2) {
		if (this.weightInPounds > d2.weightInPounds) {
			return this;
		} 
		return d2;
	}
}