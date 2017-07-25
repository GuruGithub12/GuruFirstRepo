//Supporting classes : AbstractChildClass
// Abstract method can't be instantiated.
// Abstract method can have both concrete or abstract methods.
// key word is : extends ( same as in case of inheritance)
// in abstract class the abstract methods can be used by creating object of the child class

package absInheriInterface;

public abstract class AbstractParentClass {

	public static void m1(){
		System.out.println("Guru");
	}
	public void m2(){
		System.out.println("Method 2");
	}
	
	public abstract void m3();
	public abstract void m4();
	
	
	public static void main(String[] args) {
		
		AbstractChildClass objA = new AbstractChildClass();
		objA.m2();
		objA.m3();
		objA.m4();
		AbstractParentClass.m1();
		
	}

}
