package design.structure.composite;

public class Client
{
	public static void main(String[] args)
	{
		Component leaf1 = new Leaf("leaf1");
		Component leaf2 = new Leaf("leaf2");
		
		Composite comp1 = new Composite();
		comp1.add(leaf1);
		comp1.add(leaf2);
		
		Composite comp2 = new Composite();
		Component leaf3 = new Leaf("leaf3");
		Component leaf4 = new Leaf("leaf4");
		
		comp2.add(comp1);
		comp2.add(leaf3);
		comp2.add(leaf4);
		
		comp2.doSomething();
		
	}
}
