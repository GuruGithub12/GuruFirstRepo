package gitPackage;

public class ChildClass extends ParentClass {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	ParentClass.staticMethod();
	ChildClass.staticMethod();
	ChildClass objA = new ChildClass();
	objA.nonStaticMethod();
	
	
	}

}
