package methodDispatch;

public class Main{

	public static void main(String[] args){

		Parent underTest = new Child();

		{
			A t1 = new A();
			Object t2 = t1;
			underTest.test(t1);
			underTest.test(t2);

			// object is runtime type
			// parameter is reference type
			Parent underTest2 = underTest;
			underTest2.test(t1);
			underTest2.test(t2);			
		}

		{
			B t1 = new B();
			Number t2 = t1;
			underTest.test(t1);
			underTest.test(t2);
		}
	}
}

class Parent implements Inter{
	public void test(A param){ 
		System.out.println("Parent.test(A)");
	}
	public void test(B param){ 
		System.out.println("Parent.test(B)");
	}
	public void test(Object param){ 
		System.out.println("Parent.test(Object)");
	}
	public void test(Number param){ 
		System.out.println("Parent.test(Number)");
	}
	public void test(Integer param){ 
		System.out.println("Parent.test(Integer)");
	}
	public void test(int param){ 
		System.out.println("Parent.test(int)");
	}
}

class Child extends Parent {
	public void test(A param){ 
		System.out.println("Child.test(A)");
	}
	public void test(B param){ 
		System.out.println("Child.test(B)");
	}
	public void test(Object param){ 
		System.out.println("Child.test(Object)");
	}
	public void test(Number param){ 
		System.out.println("Child.test(Number)");
	}
	public void test(Integer param){ 
		System.out.println("Child.test(Integer)");
	}
	public void test(int param){ 
		System.out.println("Child.test(int)");
	}
}

interface Inter{
	void test(A param);
	void test(B param);
	void test(Object param);
	void test(Number param);
	void test(Integer param);
	void test(int param);
}


class A {

}

class B extends Number {
	public double doubleValue() {
		return 0.0;
	}

	public float floatValue() {
		return 0.0f;
	}

	public long longValue() {
		return 0;
	}

	public int intValue() {
		return 0;
	}
}