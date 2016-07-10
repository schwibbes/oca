package defaultModifiers;

import java.lang.reflect.*;

public class Main {

public static void main(String args[]){

	for (Method m : I.class.getDeclaredMethods())
		System.out.println(m);
}
}

abstract class C implements I{
	abstract public void m();
}

interface I{
	void m();
}