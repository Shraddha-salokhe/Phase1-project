import api.Servlet;

// main method for run the program
public class Main {

	public static void main(String[] args) {
		
         //GenericServletDemo demo = new GenericServletDemo();// create object of GenericServletDemo class
         //System.out.println(demo.service(null)); // calling GenericServletDemo
         //...in place of null we can access any value like any name or anything 
	
         
         Servlet servlet = new HttpServletDemo();
         // new obj//here we import the servlet class so the output get from servlet class
         
         System.out.println(servlet.service("demo"));//calling service method 
	}
	

}
