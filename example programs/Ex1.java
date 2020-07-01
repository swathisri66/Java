//java program

class Ex1
{
	int x=10;
	static int y=35;
	void show1() // why void show1()?
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(Ex1.y); //usage with class name
		Ex1 obj=new Ex1();
	System.out.println(obj.y); //usage with the object of that class
	}
	static void show2()
	{
		//System.out.println(x); //wrong since x variable is non static 
		//and here printing directly
		System.out.println(y); //usage directly
		System.out.println(Ex1.y); //using with class name
		Ex1 obj = new Ex1();  //***imp having class to object
		System.out.println(obj.y); //usage with the object of that class
	//  show1(); //error
	//  Ex1.show1();//error
	    obj.show1();
	//  Ex1.show(); //error
	}
public static void main(String args []) {
//	System.out.println(x); //error
	System.out.println(y);
	System.out.println(Ex1.y);
	Ex1 ob1=new Ex1();
	System.out.println(ob1.x);
//  show1(); //error
    ob1.show1(); //valid obj
//	obj.show1(); //local variable of static function show2
	System.out.println("________");
	show2();
	System.out.println("**********");
	Ex1.show2();
	System.out.println("#######");
	ob1.show2();
}
}

	
	//static can be called in both in static and non static function
	//non static can be called only in non static function and this can 
	//be called in static through 
	//println is a method or non static function is in package import.java.io.printstream class
	//out is obj 
	//System is a class
	
	
	
	
		
