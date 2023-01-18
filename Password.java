import java.util.Scanner;
class Password
 {
	public static void main(String args[])
	 {
		Scanner input=new Scanner(System.in);
		System.out.println("**Your password must abide the following conditions!**");
		System.out.print("1.Password must be more than 8 in length.\n"+"2.There should be atleast 1 capital character.\n"+"3.There should be atleast 1 small character.\n"+"4.There should be 1 special symbol.\n"+"Input Password:-");
		String s=input.nextLine();

		if(is_Valid_Password(s))
		 {
			System.out.println("The password is valid.");
		 }
		else
		 {
			System.out.println("The password is invalid.");
		 }
	 }
public static boolean is_Valid_Password(String password)
 {
	if(password.length()<8) 
          return false;
	int smallCount=0;
        int capitalCount=0;
	int numCount=0;
        int specialCount=0;
	for(int i=0;i<(password.length());i++)
 	 {
		char ch=password.charAt(i);
		if(ch>='0' && ch<='9') 
		  numCount++;
		else if(ch>='a' && ch<='z') 
		  smallCount++;
                else if(ch>='A' && ch<='Z')
                  capitalCount++;
		else 
		  specialCount++;
	 }
	if(smallCount>=1 && capitalCount>=1 && specialCount>=1)
          return true;
        else 
          return false;
 }
}