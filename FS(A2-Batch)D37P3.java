A Project Manager wants to look at employee attendance data. 
Given that m employees are working  on a project and manager has 
the record of the employees present on n days of the project, 
help him find the maximum number of consecutive days on which 
all employees were present and working on the project.

As an example, there are m =  3 employees and n=5 workdays to analyze. 
The attendance data strings , data = {YYY,YYY,YNN,YYN,YYN}. 
There are only two days, at the beginning of the period where all 
the workers are present. Using zero indexing for employees, 
employees 1 and 2 are absent on the third day, and employee 2 
is also out on the fourth and fifth days. The maximum streak occurs 
at the beginning and is 2 days long.


Sample TestCase:
-------------------------------------
input=2
2
YN
NN
output =0

Explanation:
There are no days in data which indicate that all the employee are present. 

Sample TestCase:
-------------------------------------
input=4
5
YNYY
YYYY
YYYY
YYNY
NYYN
output=2

Explanation:
The Second and third days are the days on which all the employees were 
present and they are consecutive, so the result is 2.
  
import java.util.*;
public class File
{
    public static void main(String argsp[])
    {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<>();
        ArrayList<Integer> lst1 = new ArrayList<>();
        int n = sc.nextInt();
        int d = sc.nextInt();
        sc.nextLine();
        int cnt=0;
        int gc =0;
        for(int i=0;i<d;i++)
        {
           lst.add(sc.nextLine());
        }
        for(int i=0;i<lst.size();i++)
        {
            char ch[]= lst.get(i).toCharArray();
            for(int j=0;j<ch.length;j++)
            {   
                if(ch[j]=='Y')
                {
                    cnt++;
                }
                else if(ch[j]=='N')
                {
                    gc =0;
                }
            }
            if(cnt == n)
            {
                gc++;
                lst1.add(gc);
            }
            cnt=0;
        }
        if(lst1.isEmpty())
        {
            System.out.println(0);
            return;
        }
        int maxy = Collections.max(lst1);
        System.out.println(maxy);
    }
}
