package test;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Path("/MyRestService")
@ApplicationPath("/resources")
public class RestServise extends Application{
	
	// http://localhost:8080/JAXRSRESTFul/resources/MyRestService/sayHello
	@GET
	@Path("/sayHello")
	public String getHelloMsg(){
		return "Hello World";
	}

}
