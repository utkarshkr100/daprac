import java.util.*;

public class TwoSumProblem 
{   public static boolean isThere (int arr1[],int arr2[],int k )
	{
		boolean flag=false;
		HashSet<Integer> set= new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
				set.add(arr1[i]);
		}
		System.out.println(set);
		for(int i=0;i<arr2.length;i++)
		{
			if(set.contains(k-arr2[i]))
			{System.out.println(k-arr2[i]);
				flag= true;
			}
		}
		return flag;
		
	}
	
	public static void main(String[] args) 
	{
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {7,8,9};
		System.out.println(isThere(arr1,arr2,60));
	}
}
