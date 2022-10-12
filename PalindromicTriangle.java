import java.util.*;
public class PalindromicTriangle {
    public static void main(String argus[]){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the required row size : ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j>i){
                System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
                for(int k=2;k<=i;k++){
                    if(i==1){
                        continue;
                    }
                    System.out.print(k);
                }
                System.out.print("\n");
        }
    }
}
/*
 Output:
 Enter the required row size : 5
    1
   212
  32123
 4321234
543212345
 */