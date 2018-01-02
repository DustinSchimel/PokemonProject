package pokemon.model;

public class Axew extends Pokemon implements Dragon
{
	public Axew()
	{
		super(610, "Axew");
		setup();
	}
	
	public Axew(String name)
	{
		super(610, name);
		setup();
	}
	
	public Axew(int number, String name)
	{
		super(number, name);
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
