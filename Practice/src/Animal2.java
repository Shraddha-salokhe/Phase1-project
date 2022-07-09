
// initialize objects by using method

public class Animal2 {
	String color;// instance variables
	int age;
	
	void intObj(String c,int a) {// method for initialize value
		
		color =  c;//initialize value to instance variables
		age = a;
	}
	void display() { //for dispaly output..create one method
		System.out.println(color + " " + age);
	}

	public static void main(String[] args) {
		Animal2 an = new Animal2 ();// create an obj
		
		an.intObj("black", 10);// passing values in obj
		an.display();
		

	}

}
