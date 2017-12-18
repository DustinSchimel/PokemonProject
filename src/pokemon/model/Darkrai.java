package pokemon.model;

public class Darkrai extends Pokemon implements Dark
{
	public Darkrai(int number, String name)
	{
		super(number, name);
	}
	
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
