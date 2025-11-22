/*
In a college N number of students got selected for a drama for an annual day 
function. Selection is done on the basis of student Height. The selected 
students stand in queue in Ascending order of their height. All the students 
are of distinct height. Now, in charge of the selection team wants to know 
whether his favorite heighted student got selected or not. 
Note: If selected, he wants to know at which position he is in the queue. 
If not selected, he wants to know where his actual position would be in the 
queue.

Note: Do not use built-in functions


Sample Input:
4          --->Number of selected students
1 3 5 6    --->student Heights in Ascending order
5          --->favorite height 

Sample Output: 2

Sample test case

case=1
input=4
1 3 5 6
5
output=2
*/
#include <bits/stdc++.h>
using namespace std;

int main(){
    int n, fav_height;
    cin >> n;
    vector<int> heights(n);
    for(int i=0;i<n;i++){
    cin >> heights[i];
}
cin >> fav_height;
int pos = -1;
for(int i=0;i<n;i++){
    if(heights[i] == fav_height){
        pos = i;
        break;
    }
}
if(pos == -1){
pos = upper_bound(heights.begin(),heights.end(),fav_height) - heights.begin();
}
    cout << pos << endl;
return 0;
}
