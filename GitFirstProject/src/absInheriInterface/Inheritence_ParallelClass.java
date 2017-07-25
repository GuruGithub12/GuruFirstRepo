package absInheriInterface;

public class Inheritence_ParallelClass {

	public static void main(String[] args) {
		
		
		// Static method
		
		Inheritence_ParentClass.staticMethod();
		
		//Non Static method
		
		Inheritence_ParentClass objParent2 = new Inheritence_ChildClass();
		objParent2.nonStaticMethod();
		
		
		// default method
				objParent2.defaultMethod();
		
		// Below Ref is of parent class and obj is of parallel class ( which is not child class) which is why it is throwing error.
		
		
//		Inheritence_ParentClass objParent2 = new Inheritence_ParallelClass();
		
		
		
		
	}

}
