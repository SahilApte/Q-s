Ashok is given a group of numbers. 
He is planning a return no. of tuples which statisy the following condition 
i * j = k * l where i,j,k,l are the numbers in the given group and 
i != j ! = k != l

Assume all the input numbers are distinct
Assume all the numbers are >0

The first line of input contains a size of the group followed by the 
group numbers 

If no such tuple exists print "0"

Sample Testcase:
------------------------------------------
input = 4
2 3 4 6
output = 8

Explanation :-
---------------------------
There are 8 valid tuples :

[2,6,3,4]
[2,6,4,3]
[6,2,3,4]
[6,2,4,3]
[3,4,2,6]
[4,3,2,6]
[3,4,6,2]
[4,3,6,2]


Sample Testcase:
------------------------------------------
input = 5
1 2 4 5 10
output = 16

Explanation:
-----------------------------------------
There are 16 valids tuples:
(1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)
(2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)
(2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,4,5)
(4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)


Sample Testcase:
------------------------------------------
input = 4
2 7 8 9
output = 0

5
1 2 3 4 5
0
6
2 6 8 3 12 4
40

4
10 5 20 25
0

6
2 3 4 6 8 12
40

10
2 4 6 8 10 20 24 16 1 3
136



import java.util.*;
public class File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++)al.add(sc.nextInt());
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    for (int k = 0; k < n; k++) {
                        if (k != i && k != j) {
                            for (int l = k + 1; l < n; l++) {
                                if (l != i && l != j && al.get(i) * al.get(j) == al.get(k) * al.get(l)) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.print(count*2);
    }
}
