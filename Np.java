class Np
{  
     public static void main(String args[]){  
      int r,a=0,p;    
      int n=1234;
      p=n;    
      while(n>0)
	{    
       r=n%10;    
       a=(a*10)+r;    
       n=n/10;    
      }    
      if(p==a)    
       System.out.println("it is palin ");    
      else    
       System.out.println("not");    
    }  
    }  
