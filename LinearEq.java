/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq
 {
	public static void main(String[] args)
	{
	// Put your code here
	double a = Integer.parseInt(args[0]);
	double b = Integer.parseInt(args[1]);
	double c = Integer.parseInt(args[2]);
	double x1,x2;
	x1 = (-b + Math.sqrt(b*b-(4*a*c)))/ 2*a;
	x2 = (-b - Math.sqrt(b*b-(4*a*c)))/ 2*a;
	if(x1 == x2 )
		System.out.println("x1 is " + x1 );
	else
		System.out.println("x1 is " + x1 + " x2 is " +x2);
	}
	
}