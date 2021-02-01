import java.util.HashMap;
import java.util.Scanner;

public class ArraySubsetOfAnotherArray
{	
	static boolean subsetOrNot(int arr1[],int arr2[])
	{
		boolean flag=true;
		HashMap<Integer,Integer> map =new HashMap<>();
		for(int i=0;i<arr1.length;i++)
		{
			map.put(arr1[i],arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(!map.containsKey(arr2[i]))
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int len1=sc.nextInt();
		int len2=sc.nextInt();
		int arr1[]=new int [len1];
		int arr2[]=new int [len2];
		for(int i=0;i<len1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<len2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println(subsetOrNot(arr1,arr2));
		
	}
}
