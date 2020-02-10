package presentation;
import application.*;

import java.util.Scanner;
public class Calculator {

public static void main(String[] args) throws Exception
{
	double number1,number2,result;
	Methods m=new Methods();
	Scanner input=new Scanner(System.in);
	System.out.println("enter the first variable");
	number1=input.nextDouble();
	System.out.println("enter the second variable");
	number2=input.nextDouble();
	System.out.println("what operation you want to perform");
	System.out.println("1 addition    2 substraction      3 multiplication     4 division      (enter your choice between 1 to 4)");
	int choice=input.nextInt();
	switch(choice)
	{
	case 1:result=m.add(number1, number2);
	System.out.println("the result of addition is "    +result);
	break;
	case 2:result=m.substract(number1, number2);
	System.out.println("the result of substraction is "    +result);
	break;
	case 3:result=m.multiply(number1, number2);
	System.out.println("the result of multiplication is "    +result);
	break;
	case 4:result=m.division(number1, number2);
	System.out.println("the result of division is "    +result);
	break;
	default:System.out.println("Invalid choice");
	}
	input.close();
}


}
