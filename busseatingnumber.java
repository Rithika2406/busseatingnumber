import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int x=S.nextInt();
		    if(x>=1 && x<=10)
		    {
		        System.out.println("Lower Double");
		    }
		    else if(x>=11 && x<=15)
		    {
		        System.out.println("Lower Single");
		    }
		    else if(x>=16 && x<=25)
		    {
		        System.out.println("Upper Double");
		    }
		    else{
		        System.out.println("Upper Single");
		    }
		    
		}

	}
}
