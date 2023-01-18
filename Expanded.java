/* program to display number in expended form.
   Enter Number: 35219
   output: 
    30000+5000+200+10+9 */
import java.util.Scanner;
class Expanded
 {
	public static void main(String args[])
	 {
	Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
	int num=sc.nextInt();
	sc.close();
	String s= "";
	int c=0;
	while(num!=0)
	 {
		s="+"+(num%10)*((int)Math.pow(10,c))+s;
		c++;
		num=num/10;
	 }
		System.out.print(s);
	 }
 }