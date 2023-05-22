import java.util.*;
public class LHm
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(lhm.containsKey(s.charAt(i)))
            {
                lhm.put(s.charAt(i),lhm.get(s.charAt(i))+1);
            }
            else
            {
                lhm.put(s.charAt(i),1);
            }
        }
        // System.out.println(lhm);
        Boolean flag = false;
        for(int i=0;i<s.length();i++)
        {
            for(int val:lhm.values())
            {
                if(val==1)
                {
                    flag = true;
                    break;
                }
            }
            if(flag ==true)
            {
            if(lhm.get(s.charAt(i))==1)
            {
                System.out.print(i);
                return;
            }}
            else
            {
                System.out.print(-1);
                return;
            }
        }
    }
}
        // for(Map.Entry<Character,Integer> ent:lhm.entrySet())
        // {
        //     if(ent.getValue()==1)
        //     {
        //         System.out.println(s.indexOf(ent.getKey()));
        //         return;
        //     }
        // }
