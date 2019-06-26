import java.util.Scanner;

public class DoWhile {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int candy = 0;
        int money = 10;
        int n = 0;
        System.out.println("Would you like to buy a candy?");
        System.out.println("You have 10$ \nEach candy cost 1$");
        do {
        String ans = s.next();
        System.out.println(ans);
            if (ans.equals("yes")){
                money-=1;
                candy+=1;
                System.out.println("You have:"+candy+"Candy and "+money+"$");
                n++;
            } else {
                System.out.println("You have "+candy+"Candy and "+money+"$");
                n++;
            }
        }while(n<10);
    }
}
