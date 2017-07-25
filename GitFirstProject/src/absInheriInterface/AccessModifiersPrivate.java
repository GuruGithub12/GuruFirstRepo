//Supporting classes: AccessModifierChild
// Private methods available only with in the class ,  also check the AccessModifierChild class. 

package absInheriInterface;

public class AccessModifiersPrivate {

	
	private static void m1(){
		System.out.println("private method");
	}
		

	
	public static void main(String[] args) {
		// private method available with in the class
		AccessModifiersPrivate.m1();
	}

	public static  void m2() {
		// TODO Auto-generated method stub
		System.out.println("public method");
	}

}
