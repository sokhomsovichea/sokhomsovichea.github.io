import java.util.Scanner;//import the scanner
public class Chicken {
    public void ChickenDish(){// we have to give the obj name and what obj allow us to do is to use all the staff that in the class
        Scanner ans = new Scanner(System.in);//ans is the scanner name which we use for getting the input
        System.out.println("1. Fried Chicken 2. Roasted Chicken 3. DeepFried Chicken");
        int choice = ans.nextInt();
        System.out.println("You Choose:"+choice);
    }     //obj without any parameter


    /*public void Info(String name){
        System.out.println("Welcome to the guild "+name);
    }*///obj with parameter
}
