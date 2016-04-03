package design.structure.adapter;

public class Client
{
	public static void main(String[] args)
	{
		Target t = new Adapter();
		t.method1();
	}
}
