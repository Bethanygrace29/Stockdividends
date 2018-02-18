//Created by Bethany Taylpr
//Assignment 2

import java.util.Scanner;

public class stocks1 {

	
		// TODO Auto-generated constructor stub

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		// declare name as a string
		//declare variables
		String symbol;
		Double dividend;
		Integer shares;
		Double price;
		Double paid;
		Integer purchase;
		

		//Prompt user to enter the name of the company
		
		System.out.print("Enter the name of the company : ");
			 String names= kb.nextLine();
		
			 String name=names.toUpperCase();
			
			System.out.print("Enter the stock ticker symbol: ");
			symbol=kb.nextLine();
			//ask user to enter to reenter if greater than 4
			if (symbol.length() >4) {
				System.out.println("Stock ticker symbol must be between 2 and 4 characters in lenght.You entered" + symbol + " Please reenter:");
				System.out.println("Enter the stock ticker symbol: ");
				symbol=kb.nextLine();}
			//ask user what the annual dividends paid are
			System.out.println("Enter annual dividends paid out per share of" + " " + name + " " + "stock:");
			dividend=kb.nextDouble();
		  
			/// ask user the number of shares already owned
			System.out.println("Enter the number of " +  name + "shares you currently own: ");
			 shares=kb.nextInt();
			 {  if (shares==0) { 
					System.out.println("How many shares of" + name + " do you want to purchase: ");
			  } purchase=kb.nextInt();}
				if(shares>5000) {
				//if user enters more than 5000 ask for user to reenter
					System.out.println("Shares Owned can only be 0-5000, You entered "+ shares + "Please reenter")	;
				shares=kb.nextInt();}
					if (shares>=1) {
					// ask user price paid if shares owned greater than or equal to 1 
						System.out.println("Enter the price you paid per share of" + name +":" );
					paid=kb.nextDouble();
		 				if (paid<1) 
		 					System.out.println("The purchase price must be greater than 0"+ "Please reenter..."); 
		 				paid=kb.nextDouble();}
		 		
		 			
	//prompt user for current market price whether already purchased or not
	System.out.println("Enter the current market price for " + name + "stock: ");
		price=kb.nextDouble();
	
		if (price==0.0) {
		System.out.println("The current price must be greater than 0");
		System.out.println("Please reenter");
		price=kb.nextDouble();
			}
		else;
	
		
		System.out.println("Stock Value Output");
		//system gives total cost and output
		System.out.println("--------------------------------------------------------");
		Double total= purchase * (price);
		System.out.printf("To Purchase " + purchase + " shares of " + name + "(" + symbol +")" + "stock:$%6.2f\n",total);
		System.out.printf("Annual dividend paid out per share of " + name +": $%6.2f\n",dividend);
		Double yield= (dividend/price);
		System.out.printf("Annual dividend yield for"+ " " + name + "(" + symbol + ") stock: %6.2f\n",yield);
		Double payout=(dividend * shares);
		
		System.out.printf("Annual dividend pay out of " + shares + "of"+ name + "(" + symbol + ")" +"stock : $%6.2f\n", payout );
		   }
	}
