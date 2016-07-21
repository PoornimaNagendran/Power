package guvi;
import java.util.*;
public class PowerOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a;
int p;
int x;
System.out.println("Enter the value of number");
a=s.nextInt();
System.out.println("Enter the value of power");
p=s.nextInt();
x=(int)Math.pow(a,p);
System.out.println("The output is "+x);

	}

}
