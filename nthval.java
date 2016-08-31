import java.util.Arrays;
import java.util.Scanner;


public class stu {

	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		int[] a=new int[10];
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[a.length-3]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(n==i)
			{
				System.out.println(a[i]);
			}
		}
	}

}
