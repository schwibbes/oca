package referenceVsInstanceType;

public class Main {

	public static void main(String[] args) {
		Animal test = new Bird();
		test.sayHello();
		test.breathe();

		Bird test2 = (Bird) test;
		test2.sayHello();

		Living test3 = (Living) test;
		test3.sayHello();
	}
}

class Bird extends Animal{
	public static void sayHello() {
		System.out.println("bird: ");
	}
}

class Animal implements Living{
	public static void sayHello() {
		System.out.println("animal: ");
	}
}

interface Living{

	static void sayHello() {
		System.out.println("living: ");
	}

	static default void breathe() {
		System.out.println("i'm breathing");
	}
}
