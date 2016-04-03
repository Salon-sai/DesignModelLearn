package design.structure.adapter;

public class Adapter extends Adaptee implements Target
{
	public void method1()
	{
		this.method2();
	}
}
