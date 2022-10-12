import java.util.*;
public class columnNumberTriangle {
    public static void main(String args[]){
    int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required row size : ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
            }
            for(int k=1;k<=i;k++){
                System.out.print(" "+k);
            }
            System.out.print("\n");
        }
    }
}/*
Output:
Enter the required row size : 5
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
 
 */
