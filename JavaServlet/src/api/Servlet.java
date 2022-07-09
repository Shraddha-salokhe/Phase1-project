package api;

//create interface
public interface Servlet {
     
	// ...> methods
	// ...> bydefault interfaces is abstract class
	 void init(ServletConfig config);//config is just variable name...servletConfig is a class which we created
	 
	 String service(String methodType);
	 
	 void destroy();
	 
	 String getServletInfo(); // ...>we can give any name
	 
}
