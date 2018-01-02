package pokemon.model;

public class Sliggoo extends Goomy
{
	public Sliggoo()
	{
		super(705, "Sliggoo");
		setup();
	}
	
	public Sliggoo(String name)
	{
		super(705, name);
		setup();
	}
	
	public Sliggoo(int number, String name)
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
}
