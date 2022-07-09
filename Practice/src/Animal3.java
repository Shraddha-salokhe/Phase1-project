
public class Animal3 {
	
	String name;
	
	public void Name(String a) {
		name = a;
		System.out.println("I am a: ");
	}

	public static void main(String[] args) {
		
      Animal3 a = new Animal3();
      a.Name("Tiger");
      System.out.println(a.name);
	}

}
