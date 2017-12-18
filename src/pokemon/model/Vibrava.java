package pokemon.model;

public class Vibrava extends Trapinch implements Dragon
{
	public Vibrava(int number, String name)
	{
		super(number, name);
	}
	
	public String moveOutrage()
	{
		return "Vibrava uses Outrage";
	}
	
	public String moveDragonDance()
	{
		return "Vibrava uses Dragon Dance";
	}
	
	public String moveDragonPulse()
	{
		return "Vibrava uses Dragon Pulse";
	}
}
