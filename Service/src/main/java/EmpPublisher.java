import javax.xml.ws.Endpoint;

public class EmpPublisher {
	private static String URL = "http://localhost:8080/emp";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("service is published on URL :" + URL);
		Endpoint.publish(URL, new EmpServiceImpl());
		

	}

}
