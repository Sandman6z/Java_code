package explorer;

import java.util.Scanner;

public class Explorer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] data = {25, 5, 69, 564, 54, 7, 2, 5, 21, 23};
		int x = in.nextInt();
		int [] loc = new int [5];
		int a = 0;
		
		for(int i=0; i<data.length; i++)
		{
			if(x == data[i])
			{
				loc[a] = i+1;
				a++;
			}
		}
		if(loc[0] == 0)
		{
			System.out.println("None");
		}
		else
		{
			for(int i=0; i<loc.length; i++)
			{
				if(loc[i] != 0)
				{
					System.out.println(x + " is located in " + loc[i]);
				}
			}
		}
	}
}