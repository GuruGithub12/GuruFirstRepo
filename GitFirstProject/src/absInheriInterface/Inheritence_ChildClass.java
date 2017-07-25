package absInheriInterface;

public class Inheritence_ChildClass extends Inheritence_ParentClass {

	
	public static void childstaticMethod(){
		System.out.println("This is a  static method from child class");
	}
	
	
	public static void main(String[] args) {
	// Static method
		Inheritence_ParentClass.staticMethod();
		Inheritence_ChildClass.staticMethod();
		
		// Non static method - ref and obj of Child class
		
		Inheritence_ChildClass objChildRefChild = new Inheritence_ChildClass();
		objChildRefChild.nonStaticMethod();
		
		// Non static method  ref of parent class and obj of child class
		
		Inheritence_ParentClass objChildRefParent2 = new Inheritence_ChildClass();
		objChildRefParent2.nonStaticMethod();
	
		// In the below code you can't access the local method of child class( childstaticMethod) if the ref is from parent and obj is of the childclass
		
//		****************************************************
//		Inheritence_ParentClass objChildRefParent3 = new Inheritence_ChildClass();
//		objChildRefParent3.childstaticMethod();		
//		****************************************************
		
		
		// static method
		
		Inheritence_ParentClass.staticMethod();
		
	}

}
