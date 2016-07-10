package defaultModifiers;

import java.lang.reflect.*;

public class Main {

	public static void main(String args[]){

		System.out.println("Interface: ");
		for (Method m : I.class.getMethods()){
			System.out.println(m.toGenericString() + " -> " + m.getDeclaringClass());
		}

		System.out.println("Class: ");
		for (Method m : C.class.getMethods()){
			System.out.println(m.toGenericString() + " -> " + m.getDeclaringClass());
		}

		//http://stackoverflow.com/questions/6056124/do-interfaces-inherit-from-object-class-in-java
		I test = new C() {
			public void m(String s){ }
		};
		test.toString();
	}
}

abstract class C implements I{
	abstract public void m(String str2);
}

interface I {
	void m(String str);

	default void m2(){}
}