package pac1;
import java.util.Scanner;
public class count_frequency_of_each_element_of_an_array {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int n;
		n=input.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=input.nextInt();
		}
		boolean visited[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
			if(visited[i])
			{
				continue;
			}
			int freq=1;
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]==ar[j])
				{
					visited[j]=true;
					freq++;
					break;
				}
			}
			System.out.println(ar[i]+"="+freq);
		}
		
	}

}
