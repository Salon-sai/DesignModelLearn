package design.structure.composite1;

public class Leaf extends LeafAdapter
{
	private String msg;
	
	public Leaf(String msg)
	{
		this.msg = msg;
	}
	
	public void doSomething()
	{
		System.out.println("leaf invoke : "+ msg);
	}
}
