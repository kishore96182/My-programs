import java.net.*;  
import java.io.*;
import java.util.*;  
class Server2{  
public static void main(String args[])throws Exception{  
ServerSocket ss=new ServerSocket(7777);  
Socket s=ss.accept();  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
Scanner sc=new Scanner(System.in);  
// String a=s.isConnected();
String str="",str2="";  
while(s.isConnected()&&(!s.isClosed())){  
str=din.readUTF();  
System.out.println("client says: "+str);  
str2=sc.next();  
dout.writeUTF(str2);  
dout.flush();  
}  
din.close();  
s.close();  
ss.close();
}}
