import java.util.Scanner;
class WordNum
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    sc.close();
    StringBuffer str = new StringBuffer();
    int dig=0;
    while(num!=0)
    {
      dig = num%10;
      switch(dig)
      {
      case 0: str.append(" Zero");
      break;
      case 2: str.append(" Two");
      break;
      case 1: str.append(" One");
      break;
      case 3: str.append(" Three");
      break;
      case 4: str.append(" Four");
      break;
      case 5: str.append(" Five");
      break;
      case 6: str.append(" Six");
      break;
      case 7: str.append(" Seven");
      break;
      case 8: str.append(" Eight");
      break;
      case 9: str.append(" Nine");
      break;
      }
      num=num/10;
    }
    System.out.println(str);
  }
}