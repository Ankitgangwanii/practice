import java.util.*;
class PowerCalculation
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Base");
			int base=sc.nextInt();
			System.out.println("Enter Exponent");
			int exponent=sc.nextInt();
			System.out.println("The Result is" + Math.pow(base,exponent));
		}
}
		