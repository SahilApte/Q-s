Imagine you are working on a project that involves organizing data from 
a survey conducted among students. The survey collects information about
both their academic performance and extracurricular activities.
Each student's data is represented by a list in the following format:

[x1, x2, ..., xn, y1, y2, ..., yn]

Here, the elements x1, x2, ..., xn represent the academic performance metrics 
of the students (e.g., test scores, GPA), and the elements y1, y2, ..., yn 
represent their extracurricular activities (e.g., sports, clubs, hobbies).

To present the data in a more intuitive and readable format, you need to
rearrange the list so that it follows the pattern:

[x1, y1, x2, y2, ..., xn, yn]

This format ensures that for each student, their academic performance metric
comes first, followed by their extracurricular activity.

By transforming the list in this way, you will be able to analyze the data 
more effectively, comparing academic performance with specific extracurricular
involvement for each student. It will also make it easier to visualize and
present the information to stakeholders, such as teachers, administrators, 
or parents, who may be interested in understanding the relationship between 
academic performance and extracurricular activities.

 

Sample Testcase:1
---------------------------------------------
input=[2,5,1,3,4,7]
3
output=[2,3,5,4,1,7] 

Explanation:
-----------------------------------
Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].


Sample Testcase:2
---------------------------------------------
input=[1,2,3,4,4,3,2,1]
4
output=[1,4,2,3,3,2,4,1]

import java.util.*;

public class Prog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[] = s.substring(1, s.length() - 1).split(",");
        int n = sc.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        ArrayList<Integer> lst1 = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(Integer.parseInt(s1[i]));
        }
        for (int i = n; i <s1.length; i++) {
            lst1.add(Integer.parseInt(s1[i]));
        }
        // System.out.println(lst);
        // System.out.println(lst1);
        for(int i=0;i<n;i++)
        {
            lst2.add(lst.get(i));
            lst2.add(lst1.get(i));
        }
        System.out.println(lst2);
    }
}
