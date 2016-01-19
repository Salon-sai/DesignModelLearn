package design.behavior.strategy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Client
{

	public void generatePerson(List<Person> persons)
	{
		persons.add(new Person(1, "a", 12));
		persons.add(new Person(2, "b", 23));
		persons.add(new Person(3, "c", 32));
		persons.add(new Person(4, "d", 32));
		persons.add(new Person(5, "d", 12));
		persons.add(new Person(6, "ca", 123));
	}
	
	public void printPerson(List<Person> persons)
	{
		for(Person p : persons)
			System.out.println(p);
	}
	
	@Test
	public void test() throws Exception
	{
		List<Person> persons = new ArrayList<Person>();
		generatePerson(persons);
	
		
		Environment environment = new Environment(new PersonComparatorById());
		environment.sort(persons);
		printPerson(persons);
		
		System.out.println("-----------------------------------------------------");
		environment.setCmp(new PersonComparatorByAge(false));
		environment.sort(persons);
		printPerson(persons);
	}
	
}
