package Nesopackage;

public class Constractoroverloading {
	
	int a =0;
	int b =0;
	double c=0;
	
	Constractoroverloading(){//firt 
	
	a = 10;
	b =20;
	c = 20.5;
	
	}
	
	Constractoroverloading(int x, int y){//seocond 
		
		a=x;
		b=y;
	}
	
	
	
	Constractoroverloading(int x, double y){ // third 
	
		a=x;
		c=y;
	
	}
	
	Constractoroverloading(int x, int y , double z){// forth
		
	a=x;
	b=y;
	c=z;
	}
	Constractoroverloading(int x, double y , int z){// fifth
		a=x;
		b=z;
		c=y;
	}
    void display()
    
    
    
    {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
    }
	public static void main(String[] args) {
		
		//Constractoroverloading co = new Constractoroverloading ();// call first constractor
		//co.display();
		
		//Constractoroverloading co = new Constractoroverloading (10,20); //calling second constractor
		//Constractoroverloading co = new Constractoroverloading (10,20.5); calling third constractor
		//co.display();
		//Constractoroverloading co = new Constractoroverloading (10,20,20.5);invoke forth constractor
		//co.display();
		
		Constractoroverloading co = new Constractoroverloading (10,20.5,30);// calling fifth constractor
		co.display();
	}

}
