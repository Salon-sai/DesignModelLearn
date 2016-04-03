package design.behavior.templatemethod;

import org.junit.BeforeClass;
import org.junit.Test;

public class Client
{

	private static Concrete concrete;
	
	@BeforeClass
	public static void globalInit()
	{
		concrete = new Concrete();
	}
	
	@Test
	public void test()
	{
		concrete.template();
	}
	
}
