package pokemon.model;

public class Haxorus extends Fraxure
{
	public Haxorus()
	{
		super(612, "Haxorus");
		setup();
	}
	
	public Haxorus(String name)
	{
		super(612, name);
		setup();
	}
	
	public Haxorus(int number, String name)
	{
		super(number, name);
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
