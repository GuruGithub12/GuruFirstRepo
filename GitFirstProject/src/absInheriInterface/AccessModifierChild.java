// supporting class1: AccessModifiersPrivate
// supporting class2: AccessModifierProtected
package absInheriInterface;

public class AccessModifierChild  {
	
	public static void main(String[] args) {
		
		// m2 is public class of AccessModifiersPrivate
		AccessModifiersPrivate.m2();
		
		
		
//		// The below code throws error as Private method is only available to the class in which it is implemented
//		****************************
//		AccessModifiersPrivate.m1();
//		****************************
		
		// m3 is static so being used with out instantiation
		AccessModifierProtected.m3();
		
		// m1 is default, so it is not static , so have to be instantiated to be used.
		AccessModifierProtected obj1 = new AccessModifierProtected();
		obj1.m1();
		
	}

}
