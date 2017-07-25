package absInheriInterface;

public class Interface_Class implements Interface_mainInterface {

	@Override
	public void method3() {

		System.out.println("method3");
		
	}


	@Override
	public void method5() {
		System.out.println("method5");
		
	}



	@Override
	public void method4() {
		System.out.println("method4");
		
	}



	@Override
	public void method2() {
		System.out.println("method2");
		
	}



	@Override
	public void method6() {
		System.out.println("method6");
		
	}



	@Override
	public void method1() {
		System.out.println("method1");
		
	}
	

	
	

	public static void main(String[] args) {
	
	
		
		
		
		Interface_Class objI = new Interface_Class();
		objI.method2();
		objI.method4();
		objI.method6();
		objI.method1();
		
		
		
	}


}
