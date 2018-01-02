package pokemon.model;

public class Trapinch extends Pokemon implements Ground
{
	
	public Trapinch()
	{
		super(328, "Trapinch");
		setup();
	}
	
	public Trapinch(String name)
	{
		super(328, name);
		setup();
	}
	
	public Trapinch(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(50);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.50);
		this.setHealthPoints(100);
	}
	
	//Ground methods
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
