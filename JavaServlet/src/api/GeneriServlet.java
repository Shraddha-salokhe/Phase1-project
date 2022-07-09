package api;

//...>SUPER CLASS

public abstract class GeneriServlet implements Servlet { //  ..>if we declare abstract class we dont have to access methods of servlet class

	@Override
	public String service(String methodType) {// we calling this service class in main class
		
		return "GeneriServlet.service()";//...>returns class here
	}

	@Override
	public void init(ServletConfig config) {
		
	}

	@Override
	public void destroy() {
		
		
	}

	@Override
	public String getServletInfo() {
		
		return null;
	} 

	
}
