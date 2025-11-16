EPAM QUESTION

# Electronic Watch

The purpose of this exercise is to familiarize you with basic `int` operations.

Estimated workload of this exercise is _30 minutes_.

### Description

Please, proceed to [ElectronicWatch](src/main/java/com/epam/rd/autotasks/meetautocode/ElectronicWatch.java) class.
The program must print an electronic watch screen output for a given value of seconds since midnight.

Input value is given via `System.in`. Output value must be printed to `System.out`

It is guaranteed, that input number is non-negative.

Output format is `h:mm:ss` \(possible values: \[0:00:00; 23:59:59\]\).

*Extra challenge*: try to solve the task without using `if` statements or cycles.

### Examples

---
Input: `60`

Output: `0:01:00`

---
Input: `3599`

Output: `0:59:59`

---
Input: `86229`

Output: `23:57:09`

---
Input: `86400`

Output: `0:00:00`

---
Input: `89999`

Output: `0:59:59`

---
Input: `86460`

Output: `0:01:00`

---



import java.util.Scanner;

public class ElectronicWatch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int second = seconds%60;
        if(hours ==24)hours = 0;
        System.out.printf("%d:%02d:%02d",hours,minutes,second);
    }
}

