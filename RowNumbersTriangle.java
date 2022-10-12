import java.util.*;
public class RowNumbersTriangle {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required row size : ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j>i){
                    System.out.print(" ");
                } else {
                    System.out.print(" "+i);
                }
            }
            System.out.print("\n");
        }
    }
}
/*
 *Output:
 Enter the required row size : 5
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
 */
