
import java.util.Scanner; 
class hello{
    public static void main(String args[])
    {
        Scanner s1= new Scanner(System.in);
       String name = s1.nextLine();
       int age = s1.nextInt();
       s1.nextLine();
       String address= s1.nextLine();
       System.out.println(name);
       System.out.println(age);
       System.out.println(address);
    }
}