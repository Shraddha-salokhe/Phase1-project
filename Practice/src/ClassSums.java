
public class ClassSums { //...> class
	int z;
	int x;
	int y;
	
	public int addition (int x,int y) { //...method of classSums
		int z = x +  y;
		return z;
		
	}

	public static void main(String[] args) {
		
		ClassSums add = new ClassSums();//...> object of class
		int z = add.addition(10, 20);// call object here
		
		System.out.println("Addition :" + z);
		
	
	}

}
