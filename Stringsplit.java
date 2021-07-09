import java.util.*;
class Stringsplit
 {
public static void main(String args[]) 
{
String str;
int s=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter string");
str=sc.nextLine();
String ch[]=str.split(" ");
int n=ch.length;
if(n==0)
{System.out.println(n);
}
else
 for(int i=n-1;i>=0;i--)
 {
 String sr=ch[i];
int m=sr.length();
 s=s+m;
}
System.out.print(s);
}
}
