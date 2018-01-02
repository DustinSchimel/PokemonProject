package pokemon.model;

public class Goomy extends Pokemon implements Dragon
{
	public Goomy()
	{
		super(704, "Goomy");
		setup();
	}
	
	public Goomy(String name)
	{
		super(704, name);
		setup();
	}
	
	public Goomy(int number, String name)
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
	
	//Dragon methods
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
