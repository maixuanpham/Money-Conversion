/*  Program:			Eclipse
    Author:			Mai Pham	
    Class:			CSCI 145
    Date:			09/21/2017
    Description:		Project 1 - Part A: Money Conversion
    I certify that the code below is my own work.
	Exception(s): N/A
*/
import java.util.*;
import java.text.NumberFormat;

public class MoneyConversion 
{
	public static void main(String[] args) 
	{
		double amount, total;
		int remainder;
		int twenty, ten, five, one, quarter, dime, nickel, penny;
		
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		System.out.println("Money Conversion");
		System.out.println("Project 1 (Part A) by Mai Pham\n");
		
		System.out.print("Enter an amount between 0.00 to 100.00 --> ");
		amount = scan.nextDouble();
		
		System.out.println("The amount $" + amount + " is being converted to:");
		
		remainder = (int)(amount*100);
		
		twenty = remainder/2000;
		remainder = remainder % 2000;
		ten = remainder/1000;
		remainder = remainder % 1000;
		five = remainder/500;
		remainder = remainder % 500;
		one = remainder/100;
		remainder = remainder % 100;
		
		quarter = remainder/25;
		remainder = remainder % 25; 
		dime = remainder/10;
		remainder = remainder % 10;
		nickel = remainder/5;
		remainder = remainder % 5;
		penny = remainder/1;
		remainder = remainder % 1;
		
		System.out.println("\t" + twenty + " twenty-dollar bills\n\t" + ten + " ten-dollar bills\n\t"
								+ five + " five-dollar bills\n\t" + one + " one-dollar bills\n\t" 
								+ quarter + " quarters\n\t" + dime + " dimes\n\t" 
								+ nickel + " nickels\n\t" + penny + " pennies\n");
		
		total = (twenty*2000)+(ten*1000)+(five*500)+(one*100)+(quarter*25)+(dime*10)+(nickel*5)+(penny*1);
		total/=100;
		
		System.out.println("Actual conversion amount: " + fmt.format(total)); 

		if (amount == total)
			System.out.println("The two amounts are the same!");
		else
			System.out.println("The two amounts are not the same!");
		
		scan.close();
	}
}
