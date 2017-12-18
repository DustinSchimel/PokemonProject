package pokemon.model;

public class Goomy extends Pokemon implements Dragon
{
	public Goomy(int number, String name)
	{
		super(number, name);
	}
	
	public String moveOutrage()
	{
		return this.getClass().getSimpleName() + " uses Outrage";
	}
	
	public String moveDragonDance()
	{
		return this.getClass().getSimpleName() + " uses Dragon Dance";
	}
	
	public String moveDragonPulse()
	{
		return this.getClass().getSimpleName() + " uses Dragon Pulse";
	}
}
