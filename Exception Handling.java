//exception demo1
public class ExeptionDemo {
	
	public static void main(String[]args)
	{	try
		{
			int i=9/0;
		
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
		System.out.println("Bye");
	}
}
//try-catch-finally
public class ExeptionDemo {
	
	public static void main(String[]args)
	{	try
		{	int i=7;
			int j=0;
			int k=i/j;
			System.out.println("output is "+ k );
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error");
		}
		finally
		{
			System.out.println(" In Bye");
		}
		
	}
}

//Multiple catches
public class ExeptionDemo {
	
	public static void main(String[]args)
	{	try
		{	
			int a[]=null;
			a[4]=8;
			int i=7;
			int j=0;
			int k=i/j;
			System.out.println("output is "+ k );
		}		
		
		catch(ArithmeticException   e)
		{
			System.out.println("Cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
				System.out.println("Stay in your limit");
		}
		catch(Exception e)
		{
			System.out.println("Something wrong");
		}
		finally
		{
			System.out.println(" In Bye");
		}
		
	}
}
//try-catch in ordered format

public class ExeptionDemo {
	
	public static void main(String[]args)
	{	try
		{	
			int a[]=new int [4];
			a[2]=8;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
				System.out.println("Stay in your limit");
		}
			
		try
			{      int i=7;
					int j=2;
					int k=i/j;
					System.out.println("output is "+ k );
			}		
		
		catch(ArithmeticException   e)
		{
			System.out.println("Cannot divide by zero");
		}
		
		finally
		{
			System.out.println(" In Bye");
		}
		
	}
}
//Throws and Throw exception

public class Main {
	static void checkAge(int age) throws ArithmeticException {
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	    }
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }

	  public static void main(String[] args) {
	    checkAge(14); // Set age to 15 (which is below 18...)
	  }
}
