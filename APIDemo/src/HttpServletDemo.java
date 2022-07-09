import api.HttpServlet;

public class HttpServletDemo extends HttpServlet{

	//....>overrides the methods from HttpServlet class
	@Override
	public String doGet() {
		
		return "HttpServletDemo::doGet()";
	}

	@Override
	public String doPost() {
	
		return "HttpServletDemo::doPost()";
	}

	
}
