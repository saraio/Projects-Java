import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class subarray {    
  public static void main(String[] args) {        
 Scanner sc=new Scanner(System.in);            
    int n=sc.nextInt();        
    int arr[]=new int[n];       
    int sum=0,count=0,sum_next=0;        
    for(int i=0;i<n;i++)            
    {            
      arr[i]=sc.nextInt();            
      if(arr[i]<0)                
        count++;            
    } for(int a=0;a<n;a++)      
    {             
      sum=arr[a];             
      for(int x=a+1;x<n;x++)                 
      {                 
        sum=sum+arr[x];                 
        if(sum<0)                     
          count++;                        
      }}    
    System.out.println(count);
  }} 
