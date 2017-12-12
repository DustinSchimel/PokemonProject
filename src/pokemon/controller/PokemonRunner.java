package pokemon.controller;

/**
 * Runs the project by calling the PokemonController
 * @author Dustin Schimel
 *
 */
public class PokemonRunner
{
	public static void main (String [] args)
	{
		PokemonController app = new PokemonController();
		app.start();
	}
}
