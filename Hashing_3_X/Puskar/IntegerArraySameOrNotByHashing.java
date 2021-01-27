import java.util.HashMap;
import java.util.Scanner;
public class IntegerArraySameOrNotByHashing
{
	static boolean unorderedNumbers(int arr1[],int arr2[])
	{
		if(arr1.length!=arr2.length)
		{
			return false;
		}
		HashMap<Integer,Integer> table=new HashMap<>();
		for(int i=0;i<arr1.length;i++)
		{
			table.put(arr1[i], table.get(arr1[i])==null?1:table.get(arr1[i])+1);
		}
		System.out.println(table);
		for(int i=0;i<arr1.length;i++)
		{
			table.put(arr2[i], table.get(arr2[i])-1);
		}
		System.out.println(table);
		boolean flag = true;
		for(HashMap.Entry<Integer, Integer> m : table.entrySet())
		{
			if(m.getValue()!=0)
			{
				flag=false;
				return flag;
			}
		}
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
