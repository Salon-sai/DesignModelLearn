package design.create;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class MapWork
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception
	{
		
		Random random = new Random();
		Map map = new TreeMap();
		for(int i = 0; i < 50; i++)
		{
			Integer key = random.nextInt(41) + 10;
			if (map.containsKey(key))
			{
				Integer value = (Integer)map.get(key);
				map.put(key, value.intValue() + 1);
			}
			else
			{
				map.put(key, new Integer(1));
			}
		}
		
		Set entries = map.entrySet();
		Map.Entry entry = null;
		for(Iterator iterator = entries.iterator(); iterator.hasNext(); )
		{
			entry = (Map.Entry)iterator.next();
			System.out.println("key : "+entry.getKey()+",value : "+ entry.getValue());
		}
		
		// 调用私有属性
		Private2 p = new Private2();
		Class<?> clazz = p.getClass();
		Field f = clazz.getDeclaredField("name");
		f.setAccessible(true);
		f.set(p, "lisi");
		System.out.println(p.getName());
	}
}

class Private2 
{
	private String name = "zhangsan";

	public String getName()
	{
		return name;
	}
}
