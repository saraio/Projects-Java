 import java.io.*;import java.util.*;
public class anagram {static boolean isAnagram(String a, String b) {       
  char charA[]=a.toLowerCase().toCharArray();       
  char charB[]=b.toLowerCase().toCharArray();       
  Arrays.sort(charA);       
  Arrays.sort(charB);        
  //System.out.println(charA);        
  //System.out.println(charB);       
  return Arrays.equals(charA,charB);      
}              
                      
public static void main(String[] args) {  
  Scanner scan = new Scanner(System.in);        
  String a = scan.next();        
  String b = scan.next();        
  scan.close();        
  boolean ret = isAnagram(a, b);        
  System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );    }}
