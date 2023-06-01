Ramu is playing a number game. In which he will given a number which is >0 . 

As part of the game he has to form a number smallest number which will 
contain exactly the same individual numbers present in the given number, 
and the new number formed should be greater then the given number

if no such number exists print -1

13342
13423
Sample Testcase:
------------------------------------------
input = 13
output = 31

Sample Testcase:
------------------------------------------
input = 41
output = -1

1224
1242

11
-1

878
887

100
-1

101
110

9
-1
import java.util.*;
public class File {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        int result = findNextNumber(input);
        System.out.println(result);
    }
    public static int findNextNumber(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        if (i == -1) {
            return -1;
        }
        int smallestGreaterIndex = i + 1;
        for (int j = i + 1; j < digits.length; j++) {
            if (digits[j] > digits[i]) {
                smallestGreaterIndex = j;
            }
        }
        swap(digits, i, smallestGreaterIndex);
        Arrays.sort(digits, i + 1, digits.length);

        return Integer.parseInt(String.valueOf(digits));
    }

    public static void swap(char[] arr, int i, int j) 
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
