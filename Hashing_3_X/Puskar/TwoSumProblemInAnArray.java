import java.util.*;

public class TwoSumProblemInAnArray 
{
	static void twosum(int arr[],int k)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(k-arr[i]))
			{
				System.out.println(k+"="+ arr[i]+ "+"+(k-arr[i]));
			}
			else
				map.put(arr[i],arr[i]);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		twosum(arr,12);
		
	}
}
