package Alien.ineuron;

public class HomeStarPattern_2 {

	public static void main(String[] args) {
		int n=13;
		for(int i=0;i<n;i++)
		{
		
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==0 || i+j<=n/2 || i-j>=(n-1)/2)
					System.out.print("*");
				else 
					System.out.print(" ");
				}
			System.out.println(" ");
			}
		
	
		System.out.println();
}



	}


