public class MontyHall
{
    public static void main(String[] args)
    {
        boolean[] withOutChange = new boolean[1000];
        boolean[] withChange = new boolean[1000];
        boolean[] doors = new boolean[3];

        for (int x = 0; x < withOutChange.length; x++)
        {
            placePrizes(doors);
            withOutChange[x] =  playGame(doors, false);
        }

        for (int x = 0; x < withChange.length; x++)
        {
            placePrizes(doors);
            withChange[x] = playGame(doors, true);
        }

        System.out.println("Chances of winning without changing: " + countPrizes(withOutChange) + "%");
        System.out.println("Chances of winning with changing   : " + countPrizes(withChange) + "%");
    } // end of main method

    public static void placePrizes(boolean[] doors)
    {
        for (int x = 0; x < doors.length; x++)
        {
            doors[x] = false;
        }
        int carDoor = (int)(Math.random() * 3);
        System.out.println("CAR DOOR IS: " + carDoor);
        doors[carDoor] = true;
    }  // end of placePrizes method

    public static boolean playGame(boolean[] doors, boolean changeDoor)
    {
        int playerChoice = (int)(Math.random() * 3);
        System.out.println("Players first choice: " + playerChoice);
        int revealedDoor = -1;

        for (int x = 0; x < doors.length; x++)
        {
            if (!doors[x] &&  x != playerChoice)
            {
                revealedDoor = x;
                break;
            }
        }
        System.out.println("revealed door: " + revealedDoor);

        if (changeDoor)
        {
            int randomNumber = -1;
            int originalChoice = playerChoice;
            do
            {
                randomNumber = (int)(Math.random() * 3);
            }
            while(!(randomNumber != originalChoice && randomNumber != revealedDoor));
            playerChoice = randomNumber;
            System.out.println("The players second choice is: " + playerChoice);
        }  // end of if block
        return doesPlayerWin(playerChoice, doors);
    } // end of playGame method

    public static boolean doesPlayerWin(int playerChoice, boolean[] doors)
    {
        if (doors[playerChoice])
        {
            System.out.println("You won!");
            return true;
        }
        else
        {
            System.out.println("You lost...");
            return false;
        }
    } // end of doesPlayerWin method

    public static double countPrizes(boolean[] wins)
    {
        int winsCount = 0;
        for (int x = 0; x < wins.length; x++)
        {
            if (wins[x] == true)
            {
                winsCount++;
            } // end of if statement
        }  // end of for block
        return ((double)winsCount/(double)wins.length) * 100.0;
    }
} // end of class