import java.util.Scanner;

class Calculator
{
	public int n1, n2, j, mod_res;
	Calculator(int n1, int n2) 
	{
		System.out.println("Calculator opened");
		this.n1 = n1;
		this.n2 = n2;		
	}
	public int add()
	{
		return (this.n1 + this.n2);
	}
	public int sub()
	{
		return (this.n1 - this.n2);
	}
	public int mul()
	{
		return (this.n1 * this.n2);
	}

	public void modulus()
	{
		try {
			mod_res= n1 % n2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Modulus error");
		}
		System.out.println("Modulus of "+n1 + "and  "+ n2+ "is "+ mod_res);
	}
	
	public void div()
	{
			
		try {
			j= n1/n2;
	            
	        }
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero error");
		}
		
		System.out.println("Division of "+" " + n1+" and " + n2+" is " + j);
	}
}


public class ArthemeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator a_obj = new Calculator(50,0);
		System.out.println("Addition of "+" " +a_obj.n1+" and " + a_obj.n2+" is  " + a_obj.add());
		System.out.println("Substraction of "+" " +a_obj.n1+" and " + a_obj.n2+" is  " + a_obj.sub());
		System.out.println("Multiplication of "+" " +a_obj.n1+" and " + a_obj.n2+" is  " + a_obj.mul());
		
		a_obj.modulus();
	    a_obj.div();
		
		
		

	}

}
