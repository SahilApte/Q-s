import java.util.*;
class VowelReverse
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        Stack <Character> stc = new Stack<>();
        StringBuilder bd = new StringBuilder(a);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e'|| a.charAt(i) == 'i'|| a.charAt(i) == 'o' || a.charAt(i) == 'u')
            {
                stc.push(a.charAt(i));
            }
        }
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e'|| a.charAt(i) == 'i'|| a.charAt(i) == 'o' || a.charAt(i) == 'u')
            {
                bd.setCharAt(i,stc.pop());
            }
        }
        System.out.println(bd);
    }
}
