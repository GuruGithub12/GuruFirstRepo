//Supporting classes : AbstractParentClass
// Abstract method can't be instantiated.
// Abstract method can have both concrete or abstract methods.
// key word is : extends ( same as in case of inheritance)
// in abstract class the abstract methods can be used by creating object of the child class


package absInheriInterface;

public class AbstractChildClass extends AbstractParentClass {

	public static void main(String[] args) {	
		AbstractParentClass.m1();
		AbstractChildClass objA = new AbstractChildClass();
		objA.m2();
		objA.m3();
		objA.m4();	
	}

	@Override
	public void m3() {
		System.out.println("Method 3");		
	}

	@Override
	public void m4() {
		System.out.println("Method 4");	
	}

}
