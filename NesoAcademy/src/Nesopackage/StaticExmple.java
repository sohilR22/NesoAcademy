package Nesopackage;

public class StaticExmple {

	
		
		int a;// non static variable
		static int b;// static 
		
	static void m1()
	{	
	System.out.println("this is static method");	
	
		
	
	}

void m2()
{
	System.out.println("this is m2 and  non static method");
}

void m3()// non static 
{
	a=500;//non static variable
    b=1000;//  static variable
    m1();
    m2();
    
}

	public static void main(String[] args) {// static method
	
		b=100;
		System.out.println(b);
		m1();
		
		//a=200; not accissible becuase its non static variable 
		
		//m2();// not accissible becuase its non static variable  
		
		StaticExmple  se = new StaticExmple ();
		se.a=200;
		System.out.println(se.a);
		se.m2();
	}
	}