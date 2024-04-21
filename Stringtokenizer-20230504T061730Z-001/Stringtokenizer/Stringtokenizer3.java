import java.util.StringTokenizer; 
   
public class Stringtokenizer3 
{    
  
  
 public static void main(String args[])  
 {    
     
   StringTokenizer st = new StringTokenizer("Good Evening hello world"," ");    
      
     while (st.hasMoreTokens())   
     {    
          
         System.out.println(st.nextElement());       
          
     }    
 }      
} 