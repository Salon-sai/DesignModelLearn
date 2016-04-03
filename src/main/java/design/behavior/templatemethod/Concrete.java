package design.behavior.templatemethod;

public class Concrete extends Template
{

	@Override
	public void method1()
	{
		System.out.println("step 1");
	}

	@Override
	public void method2()
	{
		System.out.println("step 2");
	}

	@Override
	public void method3()
	{
		System.out.println("step 3");
	}

}
