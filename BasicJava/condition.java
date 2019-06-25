import java.util.Scanner;

public class nested_if {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        System.out.println(age<30? "You're Still Young" : "You're pretty old now");
    }
}
