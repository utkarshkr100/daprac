import java.util.HashSet;
import java.util.Scanner;

public class RemovingCharactersOfAStringFromOtherString
{
   static String removeCommonCharacters(char arr1[],char arr2[])
   {
	   String s="";
	   HashSet<Character> set=new HashSet<>();
	   for(int i=0;i<arr2.length;i++)
	   {
		   set.add(arr2[i]);
	   }
	   for(int i=0;i<arr1.length;i++)
	   {
		   if(set.contains(arr1[i]))
			   continue;
		   else
			   s=s+arr1[i];
	   }
	   return s;
   }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char a[]=sc.next().toCharArray();
		char b[]=sc.next().toCharArray();
		String s=removeCommonCharacters(a,b);
		System.out.println(s);
		
	}
}
