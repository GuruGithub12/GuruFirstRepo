package gitPackage;

public class ParentClass {

	
	//Static method
	
		public  void nonStaticMethod(){
		System.out.println("non Static");
		}
		
		//Non Static method
		public static void staticMethod(){
			System.out.println("Static");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass.staticMethod();
	}

}
