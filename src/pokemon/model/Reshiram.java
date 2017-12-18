package pokemon.model;

public class Reshiram extends Pokemon implements Dragon, Fire
{
	public Reshiram(int number, String name)
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
	
	public String moveFlamethrower()
	{
		return this.getClass().getSimpleName() + " uses Flamethrower";
	}
	
	public String moveFireBlast()
	{
		return this.getClass().getSimpleName() + " uses Fire Blast";
	}
	
	public String moveInferno()
	{
		return this.getClass().getSimpleName() + " uses Inferno";
	}
}
