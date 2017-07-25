package basics;

public class DynamicBindingImpl {

	public static void main(String[] args) {
		
		Vehcile v = new Vehcile();
		
		Car c = new Car();
		
		Jeep j = new Jeep();
		
		/*v.blowHorn();
		c.blowHorn();
		j.blowHorn();*/
		
		Vehcile vc = new Car();
		
		vc.blowHorn();
		
		//Car cv = new Vehcile();
		
		Car c1 = new Car();
		
		vc = new Jeep();
		vc.blowHorn();
		
	}
}
