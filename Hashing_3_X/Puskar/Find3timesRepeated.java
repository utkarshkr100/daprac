import java.util.*;

public class Find3timesRepeated
{
	public static int thirdRepeatedElement(int arr[])
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], map.get(arr[i])==null?1:map.get(arr[i])+1);
		}
		for(HashMap.Entry <Integer,Integer> m:map.entrySet())
		{
			if(m.getValue()==3)
			{
				return m.getKey();
			}
		}
		return -1;
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int len=sc.nextInt();
		int arr[]=new int[ len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		int p=thirdRepeatedElement(arr);
		System.out.println(p);
		
	}
}
