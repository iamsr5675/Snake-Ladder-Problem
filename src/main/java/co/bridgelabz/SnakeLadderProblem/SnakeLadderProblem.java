package co.bridgelabz.SnakeLadderProblem;


public class SnakeLadderProblem 
{
	static int INITIAL_POSITION = 0;
	int numberOfPlayer = 1;
	
	void checkOption(int playerPosition)
	{
		int diceNumber, option;
        diceNumber = (int)(Math.random()*6+1);
        System.out .println("Dice throw: " +diceNumber);
        option = (int)(Math.random()*3);
        switch(option)
        {
        case 0:
        	playerPosition = playerPosition;
        	System.out.println("NO PLAY\n Player's current position: " +playerPosition);
        	break;
        case 1:
        	playerPosition = playerPosition + diceNumber;
        	System.out.println("Ladder\n Player's current position: " +playerPosition);
        	break;
        case 2:
        	playerPosition = playerPosition - diceNumber;
        	System.out.println("Snake\n Player's current position: " +playerPosition);
        	break;
        }
	}
    public static void main( String[] args )
    {
        System.out.println( "Welcome to SNAKE AND LADDER GAME" );
        System.out.println("Game starts at Player Position: " +INITIAL_POSITION);
        int playerPosition = INITIAL_POSITION;
        SnakeLadderProblem ob = new SnakeLadderProblem();
        ob.checkOption(playerPosition);
    }
}