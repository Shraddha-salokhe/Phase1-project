
public class Animal {    // first class animal
	 
	public void eat(){ // method
	System.out.println("I am eating");//...output// then call this senetnce	
	//System.out.println("I am running");//last this one prints
	}
	public void run() {//method 2
		System.out.println("I am running");
	}
	public static void main(String[] args) {
		
		System.out.println("Now I am : ");// first call main method statement...
    	Animal obj = new Animal();//create object for class Animal
		
    	//Animal obj1= new Animal();
    	obj.eat();// call object
    	obj.run();//we can call method with same object also 
    	 
    	 Birds br = new Birds();
         br.fly();
    	
	}
}
    class Birds { // new second class birds
    	 
    	 void fly() {
    		System.out.println("Birds are flying");
    		
    	}
    
    	
    }

