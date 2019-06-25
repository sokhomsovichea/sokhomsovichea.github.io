import java.util.Scanner;

public class forLoop {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount of time you want the loop to execute: ");
        int n = s.nextInt();
        for(int count = 1;count <= n;count++){
            System.out.println(count);
        }
        System.out.print("Enter the amount of time you want the loop to execute(loop skip 2 number each time it executed):");
        int n2 = s.nextInt();
        for(int count = 1;count <= n;count+=2){
            System.out.println(count);
        }
    }
}
