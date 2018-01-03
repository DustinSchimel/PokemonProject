package pokemon.model;

public class Darkrai extends Pokemon implements Dark
{
	public Darkrai()
	{
		super(491, "Darkrai");
		setup();
	}
	
	public Darkrai(String name)
	{
		super(491, name);
		setup();
	}
	
	public Darkrai(int number, String name)
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
	
	//Dark moves
	public String moveDarkPulse()
	{
		return this.getClass().getSimpleName() + " uses Dark Pulse";
	}
	
	public String moveCrunch()
	{
		return this.getClass().getSimpleName() + " uses Crunch";
	}
	
	public String moveNightSlash()
	{
		return this.getClass().getSimpleName() + " uses Night Slash";
	}
}
