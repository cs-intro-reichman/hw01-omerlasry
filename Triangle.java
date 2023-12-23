/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args)
	{
		// Put your code here	 
		boolean test = true;
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int x, y , z;
		x = a+b;
		y = a+c;
		z = b +c;
		if ( x< a || x<b ||x<c)
			test = false;
		if ( y< a || y<b ||y<c)
			test = false;
		if ( z< a || z<b ||z<c)
			test = false;
		System.out.println(a + ", " + b + ", " + c + ": " + test);
	}
}
