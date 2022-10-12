import java.util.*;
public class InvertedRightHalfPyramid {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required row size :");
        n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
/*
 Output:
 Enter the required row size :
5
*****
****
***
**
*

 */