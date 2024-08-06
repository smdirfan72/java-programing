import java.util.*;
class Digit
{
	public static void main(String arg[]){
		int n,m,rem,sum=0,digit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		n=sc.nextInt();
		m=n;
		while(n!=0){
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		while(sum!=0){
			rem=sum%10;
			digit+=rem;
			sum=sum/10;
		}
		System.out.println("Sum of digit:" +digit);
	}
}