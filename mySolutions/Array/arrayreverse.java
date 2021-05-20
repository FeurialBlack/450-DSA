import java.util.Scanner;

public class arrayreverse
{
	
	public static void reverse(int b[])
	{
		System.out.println("The Reversed Array is :");
		
		for(int i=4;i>=0;i--) 
		{
			System.out.print(b[i]+ " ");	
		}		
		
	}

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int a[] = new int[5];
				
		System.out.println("Enter the Array: ");
		
		for(int i=0;i<5;i++)
		{
			a[i]= input.nextInt();		
		}
		
		System.out.println("The Entered Array is :");
		
		
		for(int i=0;i<5;i++) 
		{
			System.out.print(a[i]+ " ");	
		}
		System.out.println();
		
		reverse(a);
		
		input.close();
		
		
		
		
		
		
	}

}
