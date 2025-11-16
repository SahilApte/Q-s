
/**Write a program to generate the following pattern for any given value 'n'


input = 25
output =
* * * * * * * * * * * * * * * * * * * * * * * * *
* A B C D E F G H I J K L M N O P Q R S T U V W *
* X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q *
* R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K *
* L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E *
* F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y *
* Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S *
* T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M *
* N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G *
* H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A *
* B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U *
* V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O *
* P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I *
* * * * * * * * * * * * * * * * * * * * * * * * *


input = 30 
output = 
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A B C D E F *
* G H I J K L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A B C D E F *
* G H I J K L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
**/


import java.util.*;
public class ABCDPattern
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 65;
        for(int i=0;i<n;i++)
        {
            if(i==0||i==n-1)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            for(int j=0;j<n;j++)
            {
                if(j==0||j==n-1)
                {
                    if(i==n-1)
                    {
                        return;
                    }
                    if(i==n-2)continue;
                    System.out.print("*"+" ");
                }
                else
                {
                    if(i==n-2)continue;
                System.out.print((char)num+" ");
                num++;
                }
            if(num>=91)num=65;
            }
            if(i!=n-2){
            System.out.println();}
        }
    }
}
