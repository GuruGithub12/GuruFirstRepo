package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		
		new ExceptionDemo().m1();
		
	}
	
	public void m1(){
		m2();
	}
	
	
	public void m2(){
		try{
			System.out.println(2/0);
		
		}catch(Exception a){
			System.out.println("Entered catch block");
		}finally{
			System.out.println("After Exception ");
		}
		
		File f1 = new File("");
		
		try {
			InputStream is = new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
