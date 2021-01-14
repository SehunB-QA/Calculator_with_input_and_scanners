package calculator_with_input_and_scanners;

import java.util.Scanner;

public class UserInput {
	
	private int firstNum;
	private int secondNum;
	private int userNumChoice;
	
	private double firstDouble;
	private double secondDouble;
	
	Calculator calc = new Calculator();
	
	
	public void UserInputMethod()
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("What Calculator method would you like to use?");
        System.out.println(" ");
        
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        String input = scan.nextLine();
        
        int number = Integer.parseInt(input);
        userNumChoice = number;
        
        
        
        switch (number) {
        case 1:
        System.out.println("You have chosen: Addition.");
        System.out.println(" ");
        System.out.println("Please enter your first number :");
        input = scan.nextLine();
       firstNum = Integer.parseInt(input);
       setFirstNum(firstNum);
       
       System.out.println("Please enter your second number :");
       input = scan.nextLine();
       secondNum = Integer.parseInt(input);
       setSecondNum(secondNum);
       scan.close();
       ChooseUserChoice(1); 
       break;
     
        case 2:
        	 System.out.println("You have chosen: Subtraction.");
             System.out.println(" ");
             System.out.println("Please enter your first number :");
             input = scan.nextLine();
            firstNum = Integer.parseInt(input);
            setFirstNum(firstNum);
            
            System.out.println("Please enter your second number :");
            input = scan.nextLine();
            secondNum = Integer.parseInt(input);
            setSecondNum(secondNum);
            scan.close();
            ChooseUserChoice(2); 
           
          break;
          
          
        case 3:
        	 System.out.println("You have chosen: Multiplication.");
             System.out.println(" ");
             System.out.println("Please enter your first number :");
             input = scan.nextLine();
            firstNum = Integer.parseInt(input);
            setFirstNum(firstNum);
            
            System.out.println("Please enter your second number :");
            input = scan.nextLine();
            secondNum = Integer.parseInt(input);
            setSecondNum(secondNum);
          
            scan.close();
            ChooseUserChoice(3); 
          break;
          
          
        case 4:
        	 System.out.println("You have chosen: Division.");
             System.out.println(" ");
             System.out.println("Please enter your first number :");
             input = scan.nextLine();
             firstDouble = Double.parseDouble(input);
             setFirstDouble(firstDouble);
            
            System.out.println("Please enter your second number :");
            input = scan.nextLine();
            secondDouble = Double.parseDouble(input);
            setSecondDouble(secondDouble);
            scan.close();
            ChooseUserChoice(4); 
          break;
          
          default:
        	  System.out.println(" ");
        	  System.out.println("Invalid input or something went wrong! Please try again");
        	  UserInputMethod();
         
        }
          
        
          
          
       
        
	}
	
	
	
	
	
	
	


	private void ChooseUserChoice(int userChoice) 
	{
		if(getUserNumChoice()  == 1 )
		{
			System.out.println("");
			System.out.println(calc.Addtion(getFirstNum(),getSecondNum()));
		}
		
		if(getUserNumChoice()  == 2 )
		{
			System.out.println("");
			System.out.println(calc.Subtraction(getFirstNum(),getSecondNum()));
		}
		
		if(getUserNumChoice()  == 3 )
		{
			System.out.println("");
			System.out.println(calc.Multiplication(getFirstNum(),getSecondNum()));
		}
		
		if(getUserNumChoice()  == 4 )
		{
			System.out.println("");
			System.out.println(calc.Division(getFirstDouble(),getSecondDouble()));
		}
		
		
		}
	
	


	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public int getUserNumChoice() {
		return userNumChoice;
	}

	public void setUserNumChoice(int userNumChoice) {
		this.userNumChoice = userNumChoice;
	}

	public double getFirstDouble() {
		return firstDouble;
	}

	public void setFirstDouble(double firstDouble) {
		this.firstDouble = firstDouble;
	}

	public double getSecondDouble() {
		return secondDouble;
	}

	public void setSecondDouble(double secondDouble) {
		this.secondDouble = secondDouble;
	}

}
