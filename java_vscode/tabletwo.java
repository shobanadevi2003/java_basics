import java.util.Scanner;

public class tabletwo {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + a + " = " + (i * a));
        }
        
        num.close(); // It's good practice to close the Scanner object when it's no longer needed.
    }
}
