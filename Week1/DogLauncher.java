
public class DogLauncher {
	public static void main(String[] args) {
		Dog d = new Dog(51);
		d.makeNoise();
		
		Dog d2 = new Dog(1);
		Dog bigger = Dog.maxDog(d, d2);
		bigger.makeNoise();
		
		System.out.println(Dog.chineseName);
		
	}
}