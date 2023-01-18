import java.util.Scanner;
class NumtoWord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int dig=0,rev=0;
        while(num!=0)
        {
            dig = num%10;
            rev = rev * 10 + dig;
            num=num/10;
        }
        int newnum=rev;
        dig=0;
        while(newnum!=0)
        {
            dig = newnum%10;
            switch(dig)
            {
                case 0:
                {
                    System.out.print("Zero ");
                    break;
                }
                case 1:
                {
                    System.out.print("One ");
                    break;
                }
                case 2:
                {
                    System.out.print("Two ");
                    break;
                }
                case 3:
                {
                    System.out.print("Three ");
                    break;
                }
                case 4:
                {
                    System.out.print("Four ");
                    break;
                }
                case 5:
                {
                    System.out.print("Five ");
                    break;
                }
                case 6:
                {
                    System.out.print("Six ");
                    break;
                }
                case 7:
                {
                    System.out.print("Seven ");
                    break;
                }
                case 8:
                {
                    System.out.print("Eight ");
                    break;
                }
                case 9:
                {
                    System.out.print("Nine ");
                    break;
                }
            }
            newnum=newnum/10;
        }
    }
}