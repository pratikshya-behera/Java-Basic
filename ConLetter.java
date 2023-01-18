import java.util.Scanner;
class ConLetter
{
    public static String removeDuplicates(String s)
    {
        if (s == null) 
        {
            return null;
        }
 
        char[] chars = s.toCharArray();
        char prev = 0;
        int k = 0;
 
        for (char c: chars)
        {
            if (prev != c)
            {
                chars[k++] = c;
                prev = c;
            }
        }
 
        return new String(chars).substring(0, k);
    }
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();
        sc.close();
        System.out.println(removeDuplicates(s));
    }
}