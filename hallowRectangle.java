import java.util.*;

import javax.sound.midi.Soundbank;
public class hallowRectangle {
    public static void main(String args[]){
        int m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        m = sc.nextInt();
        System.out.println("enter the column size");
        n = sc.nextInt();

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==m||j==n){
                    System.out.print("*");
                }else{
                    System.err.print(" ");
                }    
            }
            System.out.print("\n"); 
        }
    }
}

/*
output:
 Enter the row size
5
enter the column size
3
***
* *
* *
* *
***

 */
