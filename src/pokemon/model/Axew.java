package pokemon.model;

public class Axew extends Pokemon implements Dragon
{
	public Axew(int number, String name)
	{
		super(number, name);
	}
	
	public String moveOutrage()
	{
		return "Axew uses Outrage";
	}
	
	public String moveDragonDance()
	{
		return "Axew uses Dragon Dance";
	}
	
	public String moveDragonPulse()
	{
		return "Axew uses Dragon Pulse";
	}
}
