import java.io.*;
import java.util.*;
public class stringReverse {    
  public static void main(String[] args) {  
    Scanner sc=new Scanner(System.in);        
    String A=sc.next();        
    StringBuilder input = new StringBuilder(A);        
    if(A.equals(input.reverse().toString()))            
      System.out.println("Yes");        
    else            
      System.out.println("No");            
  }}
