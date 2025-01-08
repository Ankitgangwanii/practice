import java.util.*;
class Perimeter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length of Rectangle");
		int length=sc.nextInt();
		System.out.println("Enter Radius of Rectangle");
		int width=sc.nextInt();
		System.out.println("Perimeter of Rectangle is "+2*(length+width));
	}
}