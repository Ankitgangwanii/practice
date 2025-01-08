import java.util.*;
class SI
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Principal");
	int principal=sc.nextInt();
	System.out.println("Enter the Rate");
	int rate=sc.nextInt();
	System.out.println("Enter the Time");
	int time=sc.nextInt();
	System.out.println("Simple Interest is" + (principal * rate * time) / 100);
}
}