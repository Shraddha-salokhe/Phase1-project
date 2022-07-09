
public class ConstructorDemo {

	//...>1 - DEFAULT CONSTRUCTOR = COMPILER CREATES AUTOMATICALLY DEFAULT CONSTRUCTOR
//	int i;
//	String s;
	
	//....>2 - NO ARGUMENT CONSTRUCTOR = USER DEFINED,WITHOUT ARGUMENTS/VALUES
	    //ConstructorDemo(){ //....> we can not passing here any arguments/values/parameters
		
		//System.out.println("User defined No arguement constructor");
	
	
	//...>3 - PARAMETERIZED CONSTRUCTOR = PASSING THE VALUES
	   
	    String name;// instance variable
	    int id; // instance variable
	    
	  ConstructorDemo(String name,int id){// user add the parameters/arguments in constructor
		  
		  this.name = name; // 
		  this.id = id;
		  
		  }

    public static void main(String[] args) {
    	
		ConstructorDemo cd = new ConstructorDemo("Shraddha",20);
		ConstructorDemo cd1 = new ConstructorDemo("Santosh",22);
		
		System.out.println("Student 1  " + cd.name + " " + cd.id);
		System.out.println("Student 2  " + cd1.name + " " + cd.id);
		
//		
//		System.out.println(cd.i);//in default constructor returns int default value 0
//		System.out.println(cd.s);// in default constructor returns string default value null value

    }
	
	}


