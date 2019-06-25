import java.util.Scanner;

public class nested_if {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();

        if(age <20){
            System.out.println("You aren't allowed");
        }else{
            if (age>30&&age<40)
                System.out.println("You are legal to drink, but you have to responsible if you drive!");
            else
                System.out.println("You ok to drink, but take care of your health :)");
        }
    }
}
