package innerclass.demo;

 class Outer_Demo {
	 
	void Method(){
	int x = 50;
		
	System.out.println("inside outer demo");
	
		
		
 class Inner_Demo{
	
	void print(){
		System.out.println("x= " +x);
	}
}
	Inner_Demo inner = new Inner_Demo(); 
	inner.print();


	}
	
	public static void main(String[]args){
		Outer_Demo outer = new Outer_Demo();
		outer.Method();
	}
}
