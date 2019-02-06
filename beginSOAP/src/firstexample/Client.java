package firstexample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {

	private static String WEB_SERVICE_WSDL_URL = "http://localhost:8080/beginSOAP/personServiceWS?wsdl";

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL(WEB_SERVICE_WSDL_URL);
		QName qname = new QName("http://firstexample/", "PersonServiceImplService");
		Service service = Service.create(url, qname);

		PersonService personService = service.getPort(PersonService.class);

		personService.addPerson(new Person(1, "Berkay", "Demirel"));
		personService.addPerson(new Person(2, "Jax", "RS"));
		personService.addPerson(new Person(3, "Jax", "WS"));

		System.out.println("-------GET PERSON-------");
		Person getPerson = personService.getPerson(1);
		System.out.println(getPerson);

		System.out.println("-------GET ALL PERSON WITH WRAPPER-------");
		List<Person> personWrapperList = personService.getPersonsWithWrapper()
				.getPersons();
		System.out.println(personWrapperList);

		System.out.println("-------GET ALL PERSON WITH ARRAY-------");
		List<Person> personArrayList = Arrays.asList(personService
				.getPersonsWithArray());
		System.out.println(personArrayList);

	}

}
