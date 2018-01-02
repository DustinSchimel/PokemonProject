package pokemon.model;

public class Vibrava extends Trapinch implements Dragon
{
	public Vibrava()
	{
		super(329, "Vibrava");
		setup();
	}
	
	public Vibrava(String name)
	{
		super(329, name);
		setup();
	}
	
	public Vibrava(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(100);
		this.setEnhancementModifier(1.0);
		this.setHealthPoints(200);
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
