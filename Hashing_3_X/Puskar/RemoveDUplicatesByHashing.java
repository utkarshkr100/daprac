import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class RemoveDUplicatesByHashing 
{
	static String removeDuplicates(char arr[])
	{
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		Iterator<Character> it =set.iterator();
		String s=" ";
		while(it.hasNext())
		{
			s=s+it.next();
		}
		return s.trim();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s="puskarrajmishra";
		char arr[]=s.toCharArray();
		s=removeDuplicates(arr);
		
		System.out.println(s);
		
	}
}
