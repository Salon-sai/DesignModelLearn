package design.behavior.strategy;

public class PersonComparatorById extends PersonComparator
{

	public PersonComparatorById()
	{
	}
	
	public PersonComparatorById(boolean isAsc)
	{
		super(isAsc);
	}
	
	public int compare(Person p1, Person p2)
	{
		int d = p1.getId() - p2.getId();
		return isAsc ? d : -d;
	}

}
