public class Prime
{
public static void main (String []args)
{
	int i=0,x=0;
	String  pn = "";	
	for (i=1;i<=600;i++) 
	{ 
	  int t=0;
	  for(x=i;x>=1;x--)
	  {
	     if(i%x==0)
	     {
		t=t+1;
	     }
           }
	 if (t==2)
	 {
        	pn=pn+i+" ";
	  }	
}	
System.out.print("prime no is:\n" +pn);		
}		
}
