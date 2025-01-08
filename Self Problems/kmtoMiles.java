import java.util.*;
class KmtoMiles
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter in Kilometers ");
			int km=sc.nextInt();
			double miles=km*0.621371;
			System.out.println("Km to Miles is "+miles);
		}
}
