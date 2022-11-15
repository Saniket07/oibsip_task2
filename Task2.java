import java.util.Random;
import java.util.Scanner;
import java.util.*;
  
public class Task2
{
    public static void main(String[] args)
    {
        int answer, guess;
	final int MAX = 100;
	Scanner sc = new Scanner(System.in);
  	Random rand = new Random();
  	boolean correct = false;
	answer = rand.nextInt(MAX) + 1;
  	while (!correct) 
	{
  		System.out.println("Guess a number between 1 and 100: ");
		guess = sc.nextInt();
                if (guess > answer)
		{
                	System.out.println("Entered number Too large, try again");
            	}
  		else if (guess < answer)
		{
                	System.out.println("Entered number Too small, try again");
            	}

            	else 
		{
                	System.out.println("Yes, number is correct.");
  			correct = true;
            	}
        }
        System.exit(0);
    }
}