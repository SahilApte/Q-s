There is a collection of input strings and a collection of query strings. 
For each query string, determine how many times it occurs in the list of 
input strings.

For example, given input strings =[ab,ab, abc] and queries =[ab,abc,bc],
we find  2 instances of ab', 1 of 'abc' and 0 of 'bc'. For each query, 
we add an element to our return array, results =[2,1,0] .


 output should return the frequency of occurrence of each query string in strings.

matchingStrings has the following parameters:

strings - an array of strings to search
queries - an array of query strings

Input Format
The first line contains and integer n, the size of strings.
Each of the next n lines contains a string strings[i].
The next line contains q, the size of queries.
Each of the next q lines contains a string q[i].

output
Return an integer array of the results of all queries in order.

input =
4
aba
baba
aba
xzxb
3
aba
xzxb
ab
output =
2 
1 
0

strings {aba,baba,aba,xzxb}
queries {aba,xzxb,ab}

Explanation 1

Here, "aba" occurs twice, in the first and third string. The string "xzxb" 
occurs once in the fourth string, and "ab" does not occur at all.


case = 2
input =
3
def
de
fgh
3
de
lmn
fgh
output =
1
0
1

strings {def,de,fgh}
queries {de, lmn, fgh}


input =
13
abcde
sdaklfj
asdjf
na
basdn
sdaklfj
asdjf
na
asdjf
na
basdn
sdaklfj
asdjf
5
abcde
sdaklfj
asdjf
na
basdn
output =
1
3
4
3
2

strings { abcde,sdaklfj,asdjf,na,basdn,sdaklfj,
asdjf,na,asdjf,na,basdn,sdaklfj,asdjf }
queries {abcde,sdaklfj,asdjf,na,basdn}
import java.util.*;
import java.util.Map.*;
public class Maps
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        for(int i=0;i<a;i++)
        {
            String s = sc.next();
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        int b = sc.nextInt();
        LinkedHashMap<String,Integer> hm1 = new LinkedHashMap<>();
        for(int i=0;i<b;i++)
        {
            String s = sc.next();
            hm1.put(s,hm1.getOrDefault(s,0)+1);
        }
        // System.out.println(hm);
        // System.out.println(hm1);
        for(Map.Entry<String,Integer> entry:hm1.entrySet())
        {
            if(hm.containsKey(entry.getKey()))
            {
                System.out.println(hm.get(entry.getKey()));
            }
            else
            {
                System.out.println(0);
            }
        }
    }
}
