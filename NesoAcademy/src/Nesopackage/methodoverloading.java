package Nesopackage;

public class methodoverloading {

	
	
	int a ;
	int b;
	 void sum() { // first 
	 
	     a= 10;
	     b=20;
	 System.out.println(a+b);

	}
	 
	 void sum(int x, int y) { // second 
		 
		 int a= x;
		 int b= y;
		 System.out.println(a+b);
	 }
		 void sum(int x, int y,int z ) { // third 
	 System.out.println(x+y+z);
	 
	}

		 void sum(int x, double y) {// forth 
			 System.out.println(x+y);
		 }
		 
		 public static void manin(String[] args) {
			 
			methodoverloading mo =new methodoverloading ();
			 
	        mo.sum();// call the first method 
	        mo.sum(100,200); /// call the second method 
	        mo.sum(10,20,30);// call third method 
	        mo.sum(10,10.5);
	        
	        
	        
	}

		
	}


