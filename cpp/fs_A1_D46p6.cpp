/*
Given a number n, find the nth prime number. 

Sample test case
case=1
input=3
output=5

*/
#include<iostream>
#include<cmath>
using namespace std;

bool isPrime(int num){
    if(num <= 1)
        return false;
    for(int i=2;i<=sqrt(num);i++){
        if(num%i == 0){
            return false;
        }
    }    
    return true;
}    
int nthPrime(int n){
    int count = 0, num=2;
    while(count<n){
        if(isPrime(num)){
            count++;
        }
        if(count==n){
            return num;
        }
        num++;
    }
    return -1;
}
int main(){
    int n;
    cin >> n;
    cout << nthPrime(n) << endl;
    return 0;
}
