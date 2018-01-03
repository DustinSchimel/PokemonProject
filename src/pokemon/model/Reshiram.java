package pokemon.model;

public class Reshiram extends Pokemon implements Dragon, Fire
{
	public Reshiram()
	{
		super(643, "Reshiram");
		setup();
	}
	
	public Reshiram(String name)
	{
		super(643, name);
		setup();
	}
	
	public Reshiram(int number, String name)
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
	
	//Fire methods
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
