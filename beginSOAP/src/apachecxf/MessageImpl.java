package apachecxf;

public class MessageImpl implements Message {

	@Override
	public String hello() {

		System.out.println("Hello is Called.");

		return "Hello";
	}

}
