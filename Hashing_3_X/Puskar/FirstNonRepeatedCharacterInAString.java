import java.util.*;

public class FirstNonRepeatedCharacterInAString 
{
	static char nonRepeatedCharacter(char arr[])
	{
		String s="";
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], map.get(arr[i])==(null)?1:map.get(arr[i])+1);
		}
		for(HashMap.Entry <Character,Integer> m: map.entrySet())
		{
			if(m.getValue()==1)
			{
				s=s+m.getKey();
				break;
			}
		}
		s.trim();
		char a=s.charAt(0);
		return a;
		
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char arr[]=sc.next().toCharArray();
		System.out.println(nonRepeatedCharacter(arr));
		
	}
}
