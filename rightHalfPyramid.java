import java.util.*;
public class rightHalfPyramid {
    public static void main(String args[]){
        int n;
        System.out.println("Enter the number of rows required :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
    
}

/*
 Output:
 Enter the number of rows required :
5
*
**
***
****
 */