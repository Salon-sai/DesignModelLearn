package design.behavior.strategy;

import java.util.Comparator;
import java.util.List;

public class Environment
{
	private Comparator<Person> cmp;
	
	public Environment(Comparator<Person> cmp)
	{
		this.cmp = cmp;
	}

	public void setCmp(Comparator<Person> cmp)
	{
		this.cmp = cmp;
	}
	
	public void sort(List<Person> persons)
	{
		persons.sort(cmp);
	}
}
