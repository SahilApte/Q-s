/*
Convert a decimal to binary WITHOUT using recursion. 

Sample test case
case=1
input=8
output=1000

*/
#include<iostream>
using namespace std;
int main(){
    int deci,binary = 0, base = 1;
    cin >> deci;
    while(deci>0){
        int remainder = deci %2;
        binary += remainder * base;
        deci /= 2;
        base *= 10;
    }
    cout<<binary<<endl;
    return 0;
}
