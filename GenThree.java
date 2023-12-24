/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) 
	
	{
		// Put your code here
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		double a,b,c;
		double min ;
		a = (Math.random()*(y-x) + x);
		b = (Math.random()*(y-x) + x);
		c = (Math.random()*(y-x) + x);
		min = c;
		System.out.println((int)a);
		System.out.println((int)b);
		System.out.println((int)c);
		if (a<b&&a<c)
			min = a;
		else
			if(b<c)
				min = b ;
		System.out.println("The minimal generated number was "+ (int)min);	
		

		
		
	}
}