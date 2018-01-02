package pokemon.model;

public class Vibrava extends Trapinch implements Dragon
{
	public Vibrava(int number, String name)
	{
		super(number, name);
	}
	
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
