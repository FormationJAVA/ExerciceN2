package Boucles;
import java.util.Scanner;

public class boucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int sum  =0;
		for (int i=0;i<=n; ++i)
		{
			sum+=i;
		}
		System.out.println(sum);
		System.out.println((n*(n+1))/2);
		
		sum  =0;
		for (int i=0;i<=n; ++i)
		{
			sum+=Math.pow(i, 2);
		}
		System.out.println(sum);
		System.out.println((n*(n+1)*(2*n+1))/6);
		
		sum  =0;
		for (int i=0;i<=n; ++i)
		{
			sum+=Math.pow(i, 3);
		}
		System.out.println(sum);
		System.out.println((Math.pow(n,2)*Math.pow((n+1),2))/4);
		
		

	}

}
