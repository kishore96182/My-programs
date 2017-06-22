import java.io.*;
import java.util.*;

	  void aaa(int a,int b)
	{
	
		
		System.out.println("adding method",+a,+b);
	}
	 void aaa(int a,int b,int c)
	{
		//int f = a+b+c;
		System.out.println("adding method",+a,+b,+c);
	}	


class Overload
{
public static void main(String[] args)
{
	int a=10,b=20,c=30;
	Overload ov=new Overload();
	ov.aaa(a,b);
	ov.aaa(a,b,c);
	
		

}
}


