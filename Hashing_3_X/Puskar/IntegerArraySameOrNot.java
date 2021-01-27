import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class IntegerArraySameOrNot 
{
	static boolean unorderedNumbers(int arr1[],int arr2[])
	{
		if(arr1.length!=arr2.length)
		{
			return false;
		}
		boolean flag=false;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2))
			flag=true;
		
		return flag;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int len1=sc.nextInt();
		int len2=sc.nextInt();
		int arr1[]=new int[len1];
		for(int i=0;i<len1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[len2];
		for(int i=0;i<len2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println(unorderedNumbers(arr1,arr2));
		
	}
}
