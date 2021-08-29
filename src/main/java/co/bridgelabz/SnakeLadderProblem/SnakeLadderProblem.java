package co.bridgelabz.SnakeLadderProblem;


public class SnakeLadderProblem 
{
	public static void main( String[] args )
    {
        System.out.println( "Welcome to SNAKE AND LADDER GAME" );
        int INITIAL_POSITION = 0, numberOfPlayer = 1, diceNumber;
        System.out.println("Game starts at Player Position: " +INITIAL_POSITION);
        diceNumber = (int)(Math.random()*6+1);
        System.out .println(diceNumber);
    }
}