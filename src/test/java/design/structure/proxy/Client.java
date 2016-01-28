package design.structure.proxy;

import org.junit.Test;

public class Client
{
	@Test
	public void test()
	{
		Subject proxySub = new ProxySubject();
		proxySub.request();
	}
}
