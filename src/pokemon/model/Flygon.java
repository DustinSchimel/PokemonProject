package pokemon.model;

public class Flygon extends Vibrava
{
	public Flygon()
	{
		super(330, "Flygon");
		setup();
	}
	
	public Flygon(String name)
	{
		super(330, name);
		setup();
	}
	
	public Flygon(int number, String name)
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
