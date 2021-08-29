package co.bridgelabz.SnakeLadderProblem;


public class SnakeLadderProblem 
{
	static int INITIAL_POSITION = 0;
	static int FINAL_POSITION = 100;
	int numberOfPlayer = 2;
	static int counter = 1;
	static int chance = 1;
	
	
	int checkOption(int playerPosition, String name)
	{
		int diceNumber, option;
		SnakeLadderProblem obj = new SnakeLadderProblem();
        diceNumber = (int)(Math.random()*6+1);
        System.out .println("Dice throw: " +diceNumber);
        option = (int)(Math.random()*3);
        switch(option)
        {
        case 0:
        	System.out.println("NO PLAY\n"+name+" current position: " +playerPosition);
        	System.out.println("\n------------------------------------\n");
        	break;
        case 1:
        	if(playerPosition + diceNumber <= FINAL_POSITION)
        	{
        		playerPosition =  playerPosition + diceNumber;
        		System.out.println("Ladder\n"+name+" current position: " +playerPosition);
        		System.out.println("\n------------------------------------\n");
        		if(playerPosition == FINAL_POSITION)
        		{
        			return FINAL_POSITION;
        		}
            	playerPosition = obj.checkOption(playerPosition, name);
        	}
        	
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
        	System.out.println("Snake\n"+name+" current position: " +playerPosition);
        	System.out.println("------------------------------------");
        	break;
        }
        return playerPosition;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO SNAKE AND LADDER GAME" );
        System.out.println("\n_________________________________________\n");
        System.out.println("Game starts at Player Position: " +INITIAL_POSITION);
        SnakeLadderProblem ob = new SnakeLadderProblem();
        int updatedPosition1 = ob.checkOption(INITIAL_POSITION, "Player1");
        int updatedPosition2 = 0;
        while(updatedPosition1 != FINAL_POSITION && updatedPosition2 != FINAL_POSITION)
        {
        	if(chance % 2 != 0)
        	{
        		updatedPosition1 = ob.checkOption(updatedPosition1, "Player1");
            	counter++;
        	}
        	else
        	{
        		updatedPosition2 = ob.checkOption(updatedPosition2, "Player2");
            	counter++;
        	}
        	chance++;
        }
        System.out.println("Number of times the Dice was rolled to win the game: " +counter);
        if(updatedPosition1 == FINAL_POSITION)
        {
        	System.out.println("Player 1 won");
        }
        else
        {
        	System.out.println("Player 2 won");
        }
    }
}