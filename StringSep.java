/*program to seprate small,capital,symbol,numbers.
   Enter String: abc!2dRBcD3i&U#
   output
    Small Letter:abcdci
    Capital: RBDU
    Number:23
    Symbol:!&# */
import java.util.Scanner;
class StringSep
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String: ");
    String n = sc.next();
    sc.close();
    StringBuffer small = new StringBuffer();
    StringBuffer capital = new StringBuffer();
    StringBuffer num = new StringBuffer();
    StringBuffer special = new StringBuffer();
    for(int i=0; i<n.length(); i++)
    {
      if(n.charAt(i)>='a' && n.charAt(i)<='z')
         small.append(n.charAt(i));
      else if(n.charAt(i)>='A' && n.charAt(i)<='Z')
         capital.append(n.charAt(i));
      else if(n.charAt(i)>='1' && n.charAt(i)<='9')
         num.append(n.charAt(i));
      else
         special.append(n.charAt(i));
    }
    System.out.println("Small letter: "+small);
    System.out.println("Capital letter: "+capital);
    System.out.println("Numbers: "+num);
    System.out.println("Special character: "+special);
  }
}