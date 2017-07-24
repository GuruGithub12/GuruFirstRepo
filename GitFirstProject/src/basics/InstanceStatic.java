package basics;

public class InstanceStatic {

	int instVar;
	static int statVar;
	protected int time;
	
	public void incrementInstance(){
		instVar++;
	}
	
	public void incrementStatic(){
		statVar++;
	}
	
	
	public static void main(String[] args) {
		
		InstanceStatic is1 = new InstanceStatic();
		is1.incrementInstance();
		is1.incrementStatic();
		
		System.out.println(is1.instVar);
		System.out.println(is1.statVar);
		
		InstanceStatic is2 = new InstanceStatic();
		is1.instVar = 13;
		is1.statVar = 16;
		is2.incrementInstance();
		is2.incrementStatic();
		
		
		System.out.println(is2.instVar);
		System.out.println(is2.statVar);
		System.out.println(InstanceStatic.statVar);
		System.out.println(is1.instVar);
		
	}

}
