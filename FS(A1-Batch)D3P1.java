/*
King Arthur is stuck in battlefield and sends message to his general David 
to rescue him. The message has the king’s location “base” (x,y) on a map 
which is in the form of cartesian coordinate system. David’s army units 
are placed at different location (x1, y1), (x2, y2) … (xn, yn) on the map. 
David has to figure out the minimum distance between the “base” and the army 
units and dispatch the unit which is the closest. The distance between the base 
and the unit is calculated as |x1-x| + |y2-y|. 

The army unit has to be on the same line (horizontal or vertical) with that 
of the “base” location for the dispatch. Given a list of location of army units 
and the kings location (base), David has the provide the index of the unit he 
plans to dispatch. If two units have the same distance from the “base”, he 
has to provide the index of the unit that comes first in the list. If there are 
no units that can be dispatched then return -1. 
Your task is to help David in his task.

Input: 6
1 1
2 3
3 1
2 4
1 2
4 4
3 4 (base)
Output: 3


Explanation:
Input: line1 is number of points, followed by value for those points, 
followed by base point (x,y)
Output: 3

*/
import java.util.*;

class FS(A1-Batch)D3P1{

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] units= new int[n][2];
        for(int i = 0;i<n;i++){
                units[i][0] = in.nextInt();
                units[i][1] = in.nextInt();
            }
        
        int x = in.nextInt();
        int y = in.nextInt();
        int small = Integer.MAX_VALUE;
        int ind = -1;
        for(int i = 0;i<n;i++){
                if(x==units[i][0] || y==units[i][1]){
                int basex = Math.abs(x-units[i][0]);
                int basey = Math.abs(y-units[i][1]);
                if(basex+basey<small){
                    small = basex+basey;
                    ind = i;
                }
                }
            }
            System.out.println(ind);
        }
        
        
    }
