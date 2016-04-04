package design.structure.composite1;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component
{
	private List<Component> components;
	
	public Composite()
	{
		this.components = new ArrayList<Component>();
	}
	
	public Composite(List<Component> components)
	{
		this.components = components;
	}

	public void add(Component component)
	{
		components.add(component);
	}

	public void remove(Component component)
	{
		components.remove(component);
	}

	public void doSomething()
	{
		for (Component component : components)
			component.doSomething();
	}

	public List<Component> getAll()
	{
		return this.components;
	}
}
