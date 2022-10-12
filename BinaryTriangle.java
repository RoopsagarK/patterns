import java.util.*;
public class BinaryTriangle {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required row size : ");
        n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if( i%2 == 0 && j%2 == 0 || i%2 != 0 && j%2 != 0   ){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.print("\n");
        }
    }
}
/*
 Output:
 Enter the required row size : 5
1
01
101
0101
10101
 */