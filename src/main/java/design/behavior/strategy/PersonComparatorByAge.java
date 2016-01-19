package design.behavior.strategy;

public class PersonComparatorByAge extends PersonComparator
{
	public PersonComparatorByAge(boolean isAsc)
	{
		// TODO Auto-generated constructor stub
		super(isAsc);
	}
	/**
	 * 
	 * 通过年龄比较两个person大小。
	 * 如果两个person年龄相同，则通过Id进行比较
	 * 
	 * @param p1
	 * @param p2
	 */
	public int compare(Person p1, Person p2)
	{
		int d = p1.getAge() - p2.getAge(); // 比较两个person之间的年龄的差值
		if(d == 0) //若两个person之间age相同，则通过id比较
			return p1.getId() - p2.getId();
		return isAsc ? d : -d;
	}

}
