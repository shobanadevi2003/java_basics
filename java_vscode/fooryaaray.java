import java.util.Scanner;
import java.util.*;
public class fooryaaray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int[] num= new int[5];
        for(int i=0;i<=4;i++){
            num[i]=scan.nextInt();

        }
        for(int i=0;i<=4;i++){
            System.out.println(num[i]);
        }

    }
}
