import java.util.StringTokenizer;
  
public class Stringtokenizer1
{  
 public static void main(String args[])
 {  
     StringTokenizer st = new StringTokenizer("Welcome to Java Class"," ");  
     while(st.hasMoreTokens()) 
      {  
         System.out.println(st.nextToken());  
      }  
   }  
}  