import java.util.*;
public class solidRectangle{
    public static void main(String[] args){
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        m = sc.nextInt();
        System.out.println("Enter the column size");
        n = sc.nextInt();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

/*

Enter the row size
5
Enter the column size
3
***
***
***
***
***

*/