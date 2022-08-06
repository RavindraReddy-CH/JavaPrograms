package Alien.LaunchGuesserGameTeams;

import java.util.Scanner;

class GUESSER
{
	int guessNum;
	int n=10;
	
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in); 
		
		guessNum=scan.nextInt();
		
		
		if(guessNum<=10)
		{
			System.out.println(guessNum);
		}
		else
		{
			System.out.println("Pls enter the Number Lessthen or equal to 10");
			guessNumber();
		}
//		if(scan.hasNextInt()) 
////		{
////		   System.out.println(scan.nextInt());
////		}
////		else
////		{
////		   System.out.println(scan.nextInt()+" is not an Integer");
////		}
////		scan.close();//	
		
	

		
		return guessNum;
		
	}	

}

class PLAYER
{
	int pguessNum;
	int n=10;
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);		
		pguessNum=scan.nextInt();
		if(pguessNum<=n)
		{
			System.out.println(pguessNum);
		}
		else
		{
			System.out.println("Player pls guess the Number Lessthen or equal to 10");
			guessNumber();
		}
//		if(scan.hasNextInt()) 
//		{
//		   System.out.println(scan.nextInt());
//		}
//		else
//		{
//		   System.out.println(scan.nextInt()+" is not an Integer");
//		}
//		scan.close();
	

		
		
		return pguessNum;
		
	}
}

class UMPIRE
{
	int numFromGuesser;
	int numFromGuesser1;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	int numFromPlayer5;
	int numFromPlayer6;
	
	
	
	
		GUESSER g=new GUESSER();
		GUESSER g1=new GUESSER();
		
		public void collectNumFromGuesser()
		{
			System.out.println("Guesser kindly guess the number : ");

		numFromGuesser=g.guessNumber();
		}
		public void collectNumFromGuesser1()
		{
			System.out.println("Guesser1 kindly guess the number : ");

		numFromGuesser1=g1.guessNumber();
		}
	PLAYER p1=new PLAYER();
	PLAYER p2=new PLAYER();
	PLAYER p3=new PLAYER();
	PLAYER p4=new PLAYER();
	PLAYER p5=new PLAYER();
	PLAYER p6=new PLAYER();
	
	public void collectNumFromPlayer()
	{
		System.out.println("Player 1 kindly guess the number");
		numFromPlayer1=p1.guessNumber();
		System.out.println("Player 2 kindly guess the number");
		numFromPlayer2=p2.guessNumber();
		System.out.println("Player 3 kindly guess the number");
		numFromPlayer3=p3.guessNumber();
		System.out.println("Player 4 kindly guess the number");
		numFromPlayer4=p4.guessNumber();
		System.out.println("Player 5 kindly guess the number");
		numFromPlayer5=p5.guessNumber();
		System.out.println("Player 6 kindly guess the number");
		numFromPlayer6=p6.guessNumber();
	}
	void compare()
	{
		UMPIRE umpire = new UMPIRE();
		if((numFromGuesser==numFromPlayer1 || numFromGuesser==numFromPlayer2) && (numFromGuesser==numFromPlayer3 || numFromGuesser==numFromPlayer4) && (numFromGuesser==numFromPlayer5 || numFromGuesser==numFromPlayer6))
		{
		   System.out.println("Team-A, Team-B and Team-C won the Game");	
		}
		else if((numFromGuesser==numFromPlayer1 || numFromGuesser==numFromPlayer2) && (numFromGuesser==numFromPlayer3 || numFromGuesser==numFromPlayer4))
		{
		   System.out.println("Team-A, Team-B won the Game and moving to finals");
			System.out.println("Guesser kindly guess the number : ");
				numFromGuesser1=g1.guessNumber();
		   System.out.println("Player 1 kindly guess the number");
			numFromPlayer1=p1.guessNumber();
			System.out.println("Player 2 kindly guess the number");
			numFromPlayer2=p2.guessNumber();
			System.out.println("Player 3 kindly guess the number");
			numFromPlayer3=p3.guessNumber();
			System.out.println("Player 4 kindly guess the number");
			numFromPlayer4=p4.guessNumber();
		   if(numFromGuesser1==numFromPlayer1 || numFromGuesser1==numFromPlayer2)
			{
			   System.out.println("Team-A won the Game");
			}
		   else
		   {
			   System.out.println("Team-B won the Game");
		   }
		}
		else if((numFromGuesser==numFromPlayer3 || numFromGuesser==numFromPlayer4) && (numFromGuesser==numFromPlayer5 || numFromGuesser==numFromPlayer6)) 
		{
		   System.out.println("Team-B and Team-C won the Game and moving to finals");
		   System.out.println("Guesser kindly guess the number : ");
				numFromGuesser1=g1.guessNumber();
			System.out.println("Player 3 kindly guess the number");
			numFromPlayer3=p3.guessNumber();
			System.out.println("Player 4 kindly guess the number");
			numFromPlayer4=p4.guessNumber();
			System.out.println("Player 5 kindly guess the number");
			numFromPlayer5=p5.guessNumber();
			System.out.println("Player 6 kindly guess the number");
			numFromPlayer6=p6.guessNumber();
		   if(numFromGuesser1==numFromPlayer3 || numFromGuesser1==numFromPlayer4)
			{
			   System.out.println("Team-B won the Game");
			}
		   else
		   {
			   System.out.println("Team-C won the Game");
		   }
		}
		else if((numFromGuesser==numFromPlayer1 || numFromGuesser==numFromPlayer2) && (numFromGuesser==numFromPlayer5 || numFromGuesser==numFromPlayer6))
	    {
	       System.out.println("Team-A and Team-C won the Game");
	       System.out.println("Guesser kindly guess the number : ");
				numFromGuesser1=g1.guessNumber();
			System.out.println("Player 1 kindly guess the number");
			numFromPlayer1=p1.guessNumber();
			System.out.println("Player 2 kindly guess the number");
			numFromPlayer2=p2.guessNumber();
			System.out.println("Player 5 kindly guess the number");
			numFromPlayer5=p5.guessNumber();
			System.out.println("Player 6 kindly guess the number");
			numFromPlayer6=p6.guessNumber();
	       if(numFromGuesser1==numFromPlayer1 || numFromGuesser1==numFromPlayer2)
			{
			   System.out.println("Team-A won the Game and moving to finals");
			}
	       else
	       {
	    	   System.out.println("Team-C won the Game");
	       }
	    }
		else if(numFromGuesser==numFromPlayer1 || numFromGuesser==numFromPlayer2)
		{
		   System.out.println("Team-A won the Game");
		}
		else if(numFromGuesser==numFromPlayer3 || numFromGuesser==numFromPlayer4)
		{
		   System.out.println("Team-B won the Game");
		}
		else if(numFromGuesser==numFromPlayer5 || numFromGuesser==numFromPlayer6)
		{
		System.out.println("Team-C won the Game");	
		}
		else
		{
			System.out.println("Game Lost Try Again");
				umpire.collectNumFromGuesser();
				umpire.collectNumFromPlayer();
			umpire.compare();
		}
		
	}
	
}





public class LaunchGuesserGameTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UMPIRE u=new UMPIRE();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}








