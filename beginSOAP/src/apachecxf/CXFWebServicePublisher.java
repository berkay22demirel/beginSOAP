package apachecxf;

import org.apache.cxf.frontend.ServerFactoryBean;

public class CXFWebServicePublisher {

	private static String URL = "http://localhost:9000/Hello";

	public static void main(String args[]) throws Exception {

		ServerFactoryBean serverFactory = new ServerFactoryBean();
		MessageImpl messageImpl = new MessageImpl();

		serverFactory.setServiceClass(Message.class);
		serverFactory.setAddress(URL);
		serverFactory.setServiceBean(messageImpl);
		serverFactory.create();

		System.out.println("CXF Web Service is publishing...");
	}

}
