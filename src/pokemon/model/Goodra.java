package pokemon.model;

public class Goodra extends Sliggoo
{
	public Goodra()
	{
		super(706, "Goodra");
		setup();
	}
	
	public Goodra(String name)
	{
		super(706, name);
		setup();
	}
	
	public Goodra(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(150);
		this.setCanEvolve(false);
		this.setEnhancementModifier(1.5);
		this.setHealthPoints(300);
	}
}
