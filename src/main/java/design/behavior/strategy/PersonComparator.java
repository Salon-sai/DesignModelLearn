package design.behavior.strategy;

import java.util.Comparator;

public abstract class PersonComparator implements Comparator<Person>
{
	protected boolean isAsc = true;
	
	public PersonComparator()
	{
		// TODO Auto-generated constructor stub
	}
	
	public PersonComparator(boolean isAsc)
	{
		this.isAsc = isAsc;
	}
}
