package pokemon.model;

public class Fraxure extends Axew 
{
	public Fraxure()
	{
		super(611, "Fraxure");
		setup();
	}
	
	public Fraxure(String name)
	{
		super(611, name);
		setup();
	}
	
	public Fraxure(int number, String name)
	{
		super(number, name);
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(100);
		this.setEnhancementModifier(1.0);
		this.setHealthPoints(200);
	}
}
