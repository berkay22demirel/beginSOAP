package firstexample;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "firstexample.PersonService")
public class PersonServiceImpl implements PersonService {

	public static List<Person> persons = new ArrayList<>();

	@Override
	public void addPerson(Person person) {

		System.out.println("Add Person");

		if (getPerson(person.getId()) == null) {

			persons.add(person);
		}

	}

	@Override
	public Person getPerson(int id) {

		System.out.println("Get Person");

		for (Person person : persons) {

			if (person.getId() == id) {

				return person;
			}

		}

		return null;

	}

	@Override
	public PersonListWrapper getPersonsWithWrapper() {

		System.out.println("Get Persons With Wrapper");

		PersonListWrapper wrapper = new PersonListWrapper();
		wrapper.setPersons(persons);
		return wrapper;

	}

	@Override
	public Person[] getPersonsWithArray() {

		System.out.println("Get Persons With Array");

		return persons.toArray(new Person[persons.size()]);
	}

}
