package design.behavior.strategy;

public class PersonComparatorByName extends PersonComparator
{
	public PersonComparatorByName()
	{
		// TODO Auto-generated constructor stub
	}

	public PersonComparatorByName(boolean isAsc)
	{
		super(isAsc);
	}
	
	/**
	 * 
	 * @param p1
	 * @param p2
	 */
	public int compare(Person p1, Person p2)
	{
		int d = p1.getName().compareTo(p2.getName()); //比较两个person的name大小
		if( d == 0 ) // 若两个person的名字相同，则通过id进行比较
			return p1.getId() - p2.getId();
		return isAsc ? d : -d;
	}

}
