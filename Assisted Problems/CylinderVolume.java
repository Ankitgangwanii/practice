import java.util.*;
class CylinderVolume
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius");
	int radius=sc.nextInt();
	System.out.println("Enter the Height");
	int height=sc.nextInt();
	double pie=3.14;
	double volume=pie*radius*radius*height;
	System.out.println("Volume of Cylinder is "+ volume);
}
}