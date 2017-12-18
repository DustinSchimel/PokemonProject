package pokemon.model;

public class Reshiram extends Pokemon implements Fire
{
	public Reshiram(int number, String name)
	{
		super(number, name);
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
