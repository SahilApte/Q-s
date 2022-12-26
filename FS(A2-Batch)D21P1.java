/*As the usage of drugs and crimes are increasing in the city telangana government
want to compose set of police officers intoexactly two teams.Each police had
his own skill, individual skill is denoted by an integer ai 
(different police can have the same skills).

Rules to form teams:

-Firstly, these two teams should have the same size. Two more constraints:

--The first team should consist of police with distinct skills (i.e. all 
skills in the drugs team are unique).
--The second team should consist of police with the same skills (i.e. all 
skills in the crime team are equal).

Note that it is permissible that some police of the drugs team has the same 
skill as a police of the crime team.

Consider some examples (skills are given):

[1,2,3], [4,4] is not a good pair of teams because sizes should be the same;
[1,1,2], [3,3,3] is not a good pair of teams because the first team should 
not contain police with the same skills;
[1,2,3], [3,4,4] is not a good pair of teams because the second team should 
contain police with the same skills;
[1,2,3], [3,3,3] is a good pair of teams;
[5], [6] is a good pair of teams.

Your task is to find the maximum possible size x for which it is possible 
to compose
 a valid pair of teams, where each team size is x (skills in the first team
 needed to be unique, skills in the crime team should be the same between them).
 A police cannot be part of more than one team.
 
 
 
Sample TestCase
--------------------------
input:
--------------------
7
4 2 4 1 4 3 4
1 2 3 4 4 4 4

7/2 = 3

return 3
7
1 1 1 5 6 6 6
1
output
-------------
3

 
Sample TestCase
--------------------------
input:
--------------------
5
2 1 5 4 3

output
-------------
1

6
8 7 1 3 5 1

2
*/
import java.util.*;
public class FS(A2-Batch)D21P1
{
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> lst1 = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        int n = sc.nextInt();   
        for(int i=0;i<n;i++)
        {
            lst.add(sc.nextInt());
        }
        // Collections.sort(lst);
        for(int i=0;i<lst.size();i++)
        {
            if(!hs.contains(lst.get(i)))
                {hs.add(lst.get(i));}
            else
                {lst1.add(lst.get(i));}
        }
        if(hs.size()==1)
        {
            System.out.println(0);
        }
        if(hs.size() == lst1.size()){
            System.out.print(hs.size());
        }
        else
        {
        if(lst1.size()==0)
            {System.out.print(1);}
        else
        {
            System.out.println(Math.min(hs.size(),lst1.size()));
        }

        }}}
