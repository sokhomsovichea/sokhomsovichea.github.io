import java.util.Scanner;

public class name_aim {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.nextLine();
        System.out.println("Enter your aim");
        String aim = s.nextLine();
        System.out.println(name+"'s aim is:"+aim);
    }
}
