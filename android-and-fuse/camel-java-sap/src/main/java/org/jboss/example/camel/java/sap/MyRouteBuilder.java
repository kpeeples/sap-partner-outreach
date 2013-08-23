package org.jboss.example.camel.java.sap;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MyRouteBuilder extends RouteBuilder {
	//CamelNetWeaverCommand
	private String username = "P1940066098";
	private String password = "kSP*8!ngc";
	private String url = "https://sapes1.sapdevcenter.com/sap/opu/odata/IWBEP/RMTSAMPLEFLIGHT/";
	private String command = "FlightCollection(AirLineID='DL',FlightConnectionID='1400',FlightDate=datetime'2013-08-26T00%3A00%3A00')";
    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {
    	from("direct:start").toF("sap-netweaver:%s?username=%s&password=%s", url, username, password).to("log:response").to("velocity:org/jboss/example/camel/java/sap/flight-info.vm");
        
    }

}
