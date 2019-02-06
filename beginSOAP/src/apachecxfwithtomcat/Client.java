package apachecxfwithtomcat;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

public class Client {

	private static String URL = "http://localhost:9000/Hello";

	public static void main(String args[]) {

		ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		factory.setAddress(URL);

		Message client = factory.create(Message.class);

		System.out.println(client.hello());

	}

}
