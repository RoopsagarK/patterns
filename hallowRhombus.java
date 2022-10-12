import java.util.*;public class hallowRhombus {
    public static void main(String argus[]){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the required number of rows : ");
        n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                } 
            }
            for(int k=1;k<=n;k++){
                if( i==1 || i==n || k==1 || k==n ){
                System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

/*
 Output:
 Enter the required number of rows : 5
    *****
   *   *
  *   *
 *   *
*****
 */