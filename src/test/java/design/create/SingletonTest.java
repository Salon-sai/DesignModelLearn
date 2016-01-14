package design.create;

import org.junit.Test;

import junit.framework.Assert;

public class SingletonTest {

	@Test
	public void test() {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Assert.assertEquals(( singleton == singleton2 ), true);
	}

}