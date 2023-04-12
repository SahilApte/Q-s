/*
Gomez has two boxes of chocolates where different type of chocolates are 
arranged in a linear manner. Each chocolate type is identified by a unique 
number. He gives the two boxes of chocolates to his three children Peter, 
John and Mary. In order to distribute the chocolates, he tells Mary to take 
the chocolates that are common in both the boxes and the chocolates remaining 
in each box will be taken by Peter and John respectively. Your task is to help 
Mary take her share of chocolates.

Sample test case
case=1
input=3
5 10 6
5
10 5 10 9 5
output=[5, 10]

*/
import java.util.*;
class d48p1{/*
    public static List<Integer> getcommonChoc(int[] box1,int[] box2){
        Set<Integer> set1 = new TreeSet<>();
        for(int i:box1){
            set1.add(i);
        }
        Set<Integer> set2 = new TreeSet<>();
        for(int i:box2){
            set2.add(i);
        }
        List<Integer> common = new ArrayList<>();
        for(int i:set1){
            if(set2.contains(i)){
                common.add(i);
            }
        }
        return common;
    }
    */
    /*
    public static List<Integer> getcommonChoc(int[] box1, int[] box2){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:box1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Map<Integer, Integer> map1 = new HashMap<>();
        for(int i:box2){
            map.put(i,map1.getOrDefault(i,0)+1);
        }
        List<Integer>common = new ArrayList<>();
        for(int i:map.keySet()){
            if(map1.containsKey(i)){
                int count = Math.min(map.get(i),map1.get(i));
                for(int j=0;j<count;j++){
                    common.add(i);
                }
            }
        }
        return common;
    }*/

    public static Set<Integer> getcommonChoc(int[] box1,int[] box2){
        Set<Integer>box1Set = new HashSet<>();
        for(int choc:box1){
            box1Set.add(choc);
        }
        Set<Integer>commonChoc = new HashSet<>();
        for(int choc:box2){
            if(box1Set.contains(choc)){
                commonChoc.add(choc);
            }
        }
        return commonChoc;
    }

    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] box1 = new int[n];
        for(int i=0;i<n;i++){
            box1[i] = in.nextInt();
        }
        int n1 = in.nextInt();
        int[] box2 = new int[n1];
        for(int i=0;i<n1;i++){
            box2[i] = in.nextInt();
        }
        Set<Integer> commonChoc = getcommonChoc(box1,box2);
        System.out.println(commonChoc);
        // Set<Integer> set1 = new TreeSet<>();
        // for(int num:box1){
        //     set1.add(num);
        // }
        // Set<Integer> set2 = new TreeSet<>();
        // for(int num:box2){
        //     if(set1.contains(num)){
        //         set1.remove(num);
        //         set2.add(num);
        //     }
        // }
        // List<Integer> result = new ArrayList<>(set2);
        // Collections.sort(result);
        // System.out.println(result);
    }
}
