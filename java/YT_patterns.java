public class YT_patterns {

    public static void getReversePattern(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<n-i+1; j++) {
                System.out.print(" $");
            }
            System.out.println();
        }
    }
    public static void invertHalfPyramid(int n){
        for(int i=0;i<=n-1;i++){
            for(int j =n-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertHalfPyramidMirror(int n){
        for(int i=0;i<n;i++){
            for(int j =0;j<n-i;j++)
                System.out.print(" ");
            for(int j=i;j>0;j--)
                System.out.print("*");
            
            System.out.println();
        }
    }

    public static void numberPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void invertedNumberPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(++count+" ");
            }
            System.out.println();
        }
    }
    public static void zeroOneTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                if((i+j)%2==1)
                    System.out.print(0+" ");
                else
                    System.out.print(1+" ");
            }
            System.out.println();
        }
    }

    public static void hollowButterFly(int n){
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==1||i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int j =1 ;j<=(n-2*i);j++){
                System.out.print(" ");
            }
                for(int j=1;j<=i;j++){
                if(j==1||j==i||i==1||i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
      System.out.println();
            }
             for(int i=n/2;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==1||i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            for(int j =1 ;j<=(n-2*i);j++){
                System.out.print(" ");
            }
                for(int j=1;j<=i;j++){
                if(j==1||j==i||i==1||i==j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            
      System.out.println();
            }
      
    }

    public static void hollowRectangle(int m,int n){
        for(int i=1;i<=m;i++){
            for(int j =1;j<=n;j++){
                if(i==1 || i==m || j==1 || j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||j==1||j==n || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pascalsTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            int coef=1;
            // for(int j=1;j<=n-i+1;j++){
            //     System.out.print(coef+" ");
            //     coef=coef*(n-i+1-j)/j;
            // }
            for(int j=0;j<=i;++j){
                System.out.print(coef+" ");
                coef = coef*(i-j)/(j+1);
            }
            
            System.out.println();
        }
    }

//     1
//    1 2
//   1 2 3
//  1 2 3 4
// 1 2 3 4 5


    public static void halfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
    //11111
// 222
// 33
// 4
    public static void invertedHalfPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }



    
    public static void main(String[] args) {
    //    getReversePattern(5);
    //    invertHalfPyramid(5);
    // invertHalfPyramidMirror(5);
        //  numberPyramid(5);
        // invertedNumberPyramid(5);
        // floydsTriangle(5);
        // zeroOneTriangle(5);
        // test(4,5);
        // hollowButterFly(10);
        // hollowRhombus(5);
        // pascalsTriangle(5);
        // halfPyramid(5);
        invertedHalfPyramid(5);
    }
}