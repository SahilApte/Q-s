import java.util.*;

/*
Game class contains a method guess(int K)- K is the guess number.
- guess(K) returns 1, if K is smaller than P, (K < P)
- guess(K) returns -1, if K is greater than P, (K > P)
- guess(K) returns 0, if K is equal to P, (K==P)
*/

class Solution extends Game {
    public int bheemsGuess(int N) {
        int low=1,mid = 0;
        int high = N;
        while(low<=high)
        {
        mid = low + (high-low)/2;
        int check = guess(mid);
        if(check == 0)
        {
            return mid;
        }
        else if(check==(1))
        {
            low = mid +1;
        }
        else if(check==(-1))
        {
            high = mid -1;
        }
        }
        return -1;
    }
}
