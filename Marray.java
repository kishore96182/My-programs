import java.util.*;
public class Marray 
{
    public static void main(String[] args) {
    int[] a={15,42,54};
    for(int i=0;i < a.length;i++)
    {
    	System.out.println(a[i]);
    }
    int[] b = {111,222,333};
    for(int i=0;i < b.length;i++)
    {
   	System.out.println(b[i]);
    }
	int[] m=new int [a.length+b.length];
	for (int i=0;i<a.length;i++) {
	    m[i]=a[i];
	}
	for (int i=0;i<b.length;i++) {
	    m[i+a.length]=b[i];
	}
	System.out.println(Arrays.toString(m));
    }
}


