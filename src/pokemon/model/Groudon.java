package pokemon.model;

public class Groudon extends Pokemon implements Ground
{
	public Groudon()
	{
		super(383, "Groudon");
		setup();
	}
	
	public Groudon(String name)
	{
		super(383, name);
		setup();
	}
	
	public Groudon(int number, String name)
	{
		super(number, name);
	}
	
	protected void setup()
	{
		this.setAttackPoints(150);
		this.setCanEvolve(false);
		this.setEnhancementModifier(1.5);
		this.setHealthPoints(300);
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
