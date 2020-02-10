package application;


public class Methods {
public double add(double number1,double number2)
{
	return number1+number2;
}
public double substract(double number1,double number2)
{
	return number1-number2;
}
public double multiply(double number1,double number2)
{
	return number1*number2;
}
public double division(double number1,double number2) throws Exception 
{
	if(number2==0) throw new Exception("dividing bt zero");
	{
		System.out.println("cannot divide by zero");
		
		
	}
	
	
		return number1/number2;
	
}
}

