import java.io.*;
import java.util.*;
class vow
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonants");
}
}
}