package pokemon.model;

public class Trapinch extends Pokemon implements Ground
{
	public Trapinch(int number, String name)
	{
		super(number, name);
	}
	
	public String moveEarthquake()
	{
		return this.getClass().getSimpleName() + " uses Earthquake";
	}
	
	public String moveFissure()
	{
		return this.getClass().getSimpleName() + " uses Fissure";
	}
	
	public String moveDig()
	{
		return this.getClass().getSimpleName() + " uses Dig";
	}
}
