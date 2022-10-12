import java.util.*;
public class halfPyramidUsingNumbers {
    public static void main(String args[]){
      int n;
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required row size : ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
/*
 Output:
 Enter the required row size : 5
1
12
123
1234
12345
 */