import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {    
  public static void main(String[] args) {       
    Scanner sc = new Scanner(System.in);                
    int n = sc.nextInt();        
    int d = sc.nextInt();        
    int array[] = new int[n];                
    int firstnum=0;        
    for (int i=0; i<n; i++) 
    {  
      array[i] = sc.nextInt();  
    }        
    for (int j=1; j<=d; j++) 
    {
      firstnum=array[0];         
      for( int k=0;k<n;k++)            
      {                        
        if(k<(n-1))                
        {                
          array[k]=array[k+1];                           
        }            
        else if (k==n-1)                
        {                            
          array[k]=firstnum;                         
        }        
      }        
    }          
    for (int i=0; i<n; i++) 
    {              System.out.print(array[i]+" ");
    }    
  }}
