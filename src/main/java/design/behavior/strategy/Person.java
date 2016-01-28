package design.behavior.strategy;

import java.io.Serializable;

public class Person implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String name;
	
	private int age;

	public Person()
	{
		
	}
	
	public Person(int id, String name, int age)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String toString()
	{
		return "person id : "+ this.id + "，persion name : "+ this.name + "，person age : " + this.age;
	}
	
}