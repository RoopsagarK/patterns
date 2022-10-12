import java.util.*;
public class FloydsTriangle {
    public static void main(String args[]){
        int n;
        int number = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required row size : ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
              System.out.print(number+" ");
              number++;
            }
            System.out.print("\n");
        }
    }
}
/*
 Output:
 Enter the required row size : 5
1 
2 3
4 5 6 
7 8 9 10
11 12 13 14 15
 */