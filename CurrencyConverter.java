package CodeSoft;
import java.util.Scanner;
public class CurrencyConverter
{

	private static Scanner sc;

	public static void main(String[] args) 
	{
		System.out.println("1 rupee");
		System.out.println("2 Dollar");
		System.out.println("3 Euro");
		sc = new Scanner(System.in);
		System.out.println("Choose the currency..");
		int choice=sc.nextInt();
		System.out.println("Enter the amount=");
		double amount=sc.nextDouble();
		
		
		switch (choice)
		{
		case 1:
			rupee_to_other(amount);
			break;
		case 2:
			Dollar_to_other(amount);
			break;
		case 3:
			Euro_to_other(amount);
			break;
		}
	}

	
	
		private static void Dollar_to_other(double amt)  
		{
	
		System.out.println("1 Dollar="+79.37+" Ruppe");
		System.out.println();
	
		System.out.println(amt+"Dollar="+(amt*79.37)+" Ruppe");
		System.out.println();
		System.out.println("1 Dollar="+0.98+" Euro");
		System.out.println();
		System.out.println(amt+"Dollar="+(amt*0.98)+" Euro");
		System.out.println();
		
	}

		private static void rupee_to_other(double amt)
		{
		System.out.println("1 rupee="+0.013+" Dollar");
		System.out.println();
	
		System.out.println(amt+"Ruppee="+(amt+0.013)+" Dollar");
		System.out.println();
		System.out.println("1 ruppe="+0.012+" Euro");
		System.out.println();
		System.out.println(amt+"Ruppee="+(amt*0.012)+" Euro");
		System.out.println();
	}

	private static void Euro_to_other(double amt)
	{
		System.out.println("1 Euro="+80.85+" Ruppe");
		System.out.println();
	
		System.out.println(amt+"Euro="+(amt*80.85)+" Ruppe");
		System.out.println();
		System.out.println("1 Euro="+1.02+" Dollar");
		System.out.println();
		System.out.println(amt+"Euro="+(amt*1.02)+" Dollar");
	
		
	}
}




