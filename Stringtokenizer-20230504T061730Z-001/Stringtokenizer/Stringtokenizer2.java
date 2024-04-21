import java.util.*;  
  
public class Stringtokenizer2
 {  
   public static void main(String[] args) 
   {  
       StringTokenizer st = new StringTokenizer("Welcome,to,Java,Class"); 
 
       while(st.hasMoreTokens()) 
        {
          System.out.println("Next token is : " + st.nextToken(","));
        }   
   }      
}  
