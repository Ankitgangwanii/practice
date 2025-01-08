import java.util.*;
class CircleArea
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius");
	int radius=sc.nextInt();
	double pie=3.14;
	double area=pie*radius*radius;
	System.out.println("Area of Circle is "+ area);
}
}