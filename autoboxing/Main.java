package autoboxing;

public class Main{

	public static void main(String[] args) throws Exception{

		Test underTest = new Test();
		underTest.test(12);
		underTest.test((Integer)12);
		underTest.test(new Integer(12));
		
		underTest.test(12L);
		//  incompatible types: long cannot be converted to Integer
		//underTest.test((Integer)12L);
		underTest.test((int)12L);
		underTest.test((int) new Integer(12));

		underTest.test((Object)12);
	}
}

class Test {

	public void test(Object param){ 
		System.out.println("Test.test(Object)");
	}
	public void test(Number param){ 
		System.out.println("Test.test(Number)");
	}
	public void test(Integer param){ 
		System.out.println("Test.test(Integer)");
	}
	public void test(int param){ 
		System.out.println("Test.test(int)");
	}
}
