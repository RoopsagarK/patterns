import java.util.*;
public class InvertedHalfPyramidUsingNumbers {
    public static void main(String args[]){
      int n;
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required row size : ");
        n = sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j<=i){
                System.out.print(j);
            }
        }
            System.out.print("\n");
        }
    }
}
/*
 Output:
 Enter the required row size : 5
12345
1234
123
12
1

 */