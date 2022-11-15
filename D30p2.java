// Varun and Saahil are playing a word game. Saahil has given a word of length N 
// and a character(ch) which exist in the word. Now Varun's task is to find the 
// least distance of the given character in the word for each position in the word.

// Your task is to help Varun to return an array result[], where result length=N 
// and result[i] is the least distance from the given character to index i in the word.

// NOTE:
// -----
// The distance between two indices i and j is |i - j|.

// Input Format:
// -------------
// Line-1: A string represents a word
// Line-2: A character ch which exist in the word.
 
// Output Format:
// --------------
// Print an array of N values
 

// Sample Input-1:
// ---------------
// conclude
// c
 
// Sample Output-1:
// ----------------
// 0 1 1 0 1 2 3 4

 
// Sample Input-2:
// ---------------
// kmitngit
// i

// Sample Output-2:
// ----------------
// 2 1 0 1 2 1 0 1 




import java.util.*;

class d30p2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char c=sc.next().charAt(0);
        int[] d=new int[str.length()];
        Arrays.fill(d,Integer.MAX_VALUE);
        ArrayList<Integer> arl=new ArrayList<>();
        for(int i=0;i<d.length;i++)
        {
            if(str.charAt(i)== c)
            {
                arl.add(i);
            }
        }
        for(int i=0;i<d.length;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<arl.size();j++)
            {
                min=Math.min(min,Math.abs(arl.get(j)-i));
            }
            d[i]=min;
        }
        for(int j=0;j<d.length;j++)
        {
            System.out.println(d[j]+" ");
        }
    }
}


