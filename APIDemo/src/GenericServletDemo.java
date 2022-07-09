//....>extending the jar files  ---->

import api.GeneriServlet;

public class GenericServletDemo extends GeneriServlet{//...>GeneriServlet extends from jar file...so we extend here
  
	//all methods and classes which is available in GeneriServlet are extends here also
	
	@Override
	public String service(String methodType) {
		
	return "GenericServletDemo::service()";
	}

	
}
