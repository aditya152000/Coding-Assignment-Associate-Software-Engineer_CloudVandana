import java.util.*;
public class Main

{
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a String ");
	    String str = sc.nextLine();
	    
      boolean[] alphaList = new boolean[26];
      int index = 0;
      int flag = 1;
      for (int i = 0; i < str.length(); i++) {
         if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
            index = str.charAt(i) - 'A';
         }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
            index = str.charAt(i) - 'a';
      }
      alphaList[index] = true;
   }
   for (int i = 0; i <= 25; i++) {
      if (alphaList[i] == false)
      flag = 0;
   }
 
   if (flag == 1)
      System.out.print("Given string is a pangram.");
   else
      System.out.print("Given string is not a pangram.");
	}
}