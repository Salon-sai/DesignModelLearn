package design.structure.composite1;

import java.util.List;

public abstract class LeafAdapter implements Component
{

	public void add(Component component){}

	public void remove(Component component){}

	public List<Component> getAll()
	{
		return null;
	}

}
