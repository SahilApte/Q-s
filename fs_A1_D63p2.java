/*
Dave is given a string s and a list of words; he is asked to find if the string 
S can be segmented into a space-separated sequence of one or more word from the 
list of words. If S can be segmented, he has to return true, else return false. 
Note that the same word in the list of words may be reused multiple times in 
the segmentation.
Your task is to help Dave in his task.

Sample test case

case=1
input=helloworld
world hello
output=true
*/
#include <bits/stdc++.h>

using namespace std;

bool wordBreak(string s, vector<string> &wordDict){
    int n = s.length();
    vector<bool>dp(n+1,false);
    dp[0] = true;
    for(int i=0;i<n;i++){
        for(int j=0;j<wordDict.size();j++){
            if(i + wordDict[j].length() <= n && s.substr(i,wordDict[j].length()) == wordDict[j]){
                dp[i+wordDict[j].length()] = true;
            }
        }
    }
    return dp[n];
}

int main(){
    string s;
    cin >> s;
    vector<string> wordDict;
    string word;
    while(cin >> word){
    wordDict.push_back(word);
    }
    if(wordBreak(s,wordDict)){
        cout << "true"<<endl;
    }else{
        cout<< "false"<<endl;
    }
    return 0;
}
