package firstexample;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PersonService {

	@WebMethod
	public void addPerson(@WebParam(name = "person") Person person);

	@WebMethod
	public Person getPerson(@WebParam(name = "id") int id);

	@WebMethod
	public PersonListWrapper getPersonsWithWrapper();

	@WebMethod
	public Person[] getPersonsWithArray();

}
