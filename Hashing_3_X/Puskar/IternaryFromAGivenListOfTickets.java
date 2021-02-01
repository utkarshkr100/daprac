import java.util.HashMap;
import java.util.Scanner;

public class IternaryFromAGivenListOfTickets 
{
	static void printingAllThePathsInSequence(String arr[])
	{
		HashMap<String,String> map=new HashMap<>();
		for(int i=0;i<arr.length;i=i+2)
			map.put(arr[i], arr[i+1]);
		System.out.println(map);
		String source=null;
		String destination=null;
		for(HashMap.Entry<String,String>  m:map.entrySet())
		{
			System.out.println("in iteration");
			if(!map.containsValue(m.getKey()))
			{
				source=m.getKey();
				System.out.println("Source Found ->"+source);
			}
			if(!map.containsKey(m.getValue()))
			{
				destination=m.getValue();
				System.out.println("Destination Found ->"+destination);
				
			}
		}
		
		if(source==null)
		{
			System.out.println("No Source Found");
		}
		String des2=null;
		if(destination!=null&& source!=null)
		{
			while(des2!=(destination))
			{
				des2=map.get(source);
				System.out.println(source+"  -->  "+des2);
				source=des2;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();//how many iterations are there
		String arr[]=new String[len*2];
		for(int i=0;i<len*2;i++)
		{
			arr[i]=sc.next();
		}
		printingAllThePathsInSequence(arr);
	}
}
