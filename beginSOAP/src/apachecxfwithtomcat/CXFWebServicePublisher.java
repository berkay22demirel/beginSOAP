package apachecxfwithtomcat;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

@WebServlet("/cxf.webservice/*")
public class CXFWebServicePublisher extends CXFNonSpringServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void loadBus(ServletConfig servletConfig) {

		System.out.println("loadBus called");

		super.loadBus(servletConfig);
		Bus bus = getBus();
		BusFactory.setDefaultBus(bus);
		Endpoint.publish("/hellows", new MessageImpl());

	}

	

}
