package api;

public abstract class HttpServlet extends GeneriServlet{ //generi is the super class

	@Override
	public String service(String methodType) {
		
		if(methodType.equals("GET")) {
			return doGet();
		} else if(methodType.equals("Post")){
			return doPost();
		}else {
			return super.service(methodType);
			//....>we call super method with using super keyword...SUPER CLASS is GeneriServlet
		}
	}
	
	public abstract String doGet();
	public abstract String doPost();

}
