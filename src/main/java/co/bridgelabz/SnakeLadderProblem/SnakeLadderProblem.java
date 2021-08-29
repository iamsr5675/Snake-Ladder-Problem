package co.bridgelabz.SnakeLadderProblem;


public class SnakeLadderProblem 
{
	static int INITIAL_POSITION = 0;
	static int FINAL_POSITION = 100;
	int numberOfPlayer = 1;
	
	
	int checkOption(int playerPosition)
	{
		int diceNumber, option;
        diceNumber = (int)(Math.random()*6+1);
        System.out .println("Dice throw: " +diceNumber);
        option = (int)(Math.random()*3);
        switch(option)
        {
        case 0:
        	System.out.println("NO PLAY\n Player's current position: " +playerPosition);
        	break;
        case 1:
        	if(playerPosition + diceNumber <= FINAL_POSITION)
        	{
        		playerPosition =  playerPosition + diceNumber;
        	}
        	System.out.println("Ladder\n Player's current position: " +playerPosition);
        	break;
        case 2:
        	if(playerPosition - diceNumber <= 0)
        	{
        		playerPosition = 0;
        	}
        	else
        	{
        		playerPosition = playerPosition - diceNumber;
        	}
        	System.out.println("Snake\n Player's current position: " +playerPosition);
        	break;
        }
        return playerPosition;
	}
    public static void main( String[] args )
    {
        System.out.println( "Welcome to SNAKE AND LADDER GAME" );
        System.out.println("Game starts at Player Position: " +INITIAL_POSITION);
        SnakeLadderProblem ob = new SnakeLadderProblem();
        int updatedPosition = ob.checkOption(INITIAL_POSITION);
        while(updatedPosition != FINAL_POSITION)
        {
        	updatedPosition = ob.checkOption(updatedPosition);
        }
    }
}