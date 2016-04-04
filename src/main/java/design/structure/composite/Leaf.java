package design.structure.composite;

public class Leaf implements Component
{
	private String msg;
	
	public Leaf(String msg)
	{
		this.msg = msg;
	}
	
	// 可以类比成JUnit的TestCase
	public void doSomething()
	{
		System.out.println("执行方法" + msg);
	}
}
