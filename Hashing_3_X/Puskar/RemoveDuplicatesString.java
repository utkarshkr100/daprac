import java.util.*;
public class RemoveDuplicatesString
{
	public static int removeDuplicates(char arr[])
	{
		int front=0,back=arr.length-1;
		while(front<back)
		{
			int temp=0;
			while(temp<back)
			{
				if(arr[front]==arr[temp]&&front!=temp)
				{
					char aux=arr[temp];
					arr[temp]=arr[back];
					arr[back]=aux;
					back--;
					temp--;
				}
				temp++;
				
			}
			String s=new String (arr);
			System.out.println(s);
			front++;

		}
		return back+1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		String s="Puskarrajmishra";
		char arr[]=s.toCharArray();	
		int i=removeDuplicates(arr);
		for(int p=0;p<i;p++)
		{
			System.out.print(arr[p]);
		}
		sc.close();
		
	}
}
