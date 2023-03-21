/*Given a list of flight tickets represented by pairs of departure and arrival
airports [from, to], reconstruct 
the itinerary in order. All of the tickets belong to a man who departs from BZA.
Thus, the itinerary must begin with BZA.

Note:

If there are multiple valid itineraries, you should return the itinerary that
has the smallest lexical order when read as a single string. For example, the 
itinerary ["BZA", "LGA"] has a smaller lexical order than ["BZA", "LGB"].

All airports are represented by three capital letters.
You may assume all tickets form at least one valid itinerary.

Example 1:

Input:4
DEL HYD
BZA DEL
BLR MAA
HYD BLR

Output: ["BZA", "DEL", "HYD", "BLR", "MAA"]

Example 2:

Input:5
BZA BLR
BZA CCU
BLR CCU
CCU BZA
CCU BLR
Output: ["BZA","BLR","CCU","BZA","CCU","BLR"]
*/


import java.util.*;

public class Hel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[][]=new String[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.next();
            }
        }
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i][0])){
                ArrayList<String> l=hm.get(arr[i][0]);
                l.add(arr[i][1]);
                hm.put(arr[i][0],l);
            }
            else{
                ArrayList<String> l=new ArrayList<>();
                l.add(arr[i][1]);
                hm.put(arr[i][0],l);
            }
        }
        System.out.println(hm);
        ArrayList<String> res=new ArrayList<>();
        res.add("BZA");
        try{
        for(int i=0;i<n;i++){
            ArrayList<String> nex=hm.get(res.get(res.size()-1));
            res.add(String.valueOf(nex.get(0)));
            nex.remove(String.valueOf(nex.get(0)));
        }
        System.out.print(res);
        }
        catch(Exception e){
            System.out.print(res);
        }
    }
}
