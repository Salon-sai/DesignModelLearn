package design.structure.composite1;

import java.util.List;

public interface Component
{
	public void add(Component component);
	
	public void remove(Component component);
	
	public void doSomething();
	
	public List<Component> getAll();	
}
