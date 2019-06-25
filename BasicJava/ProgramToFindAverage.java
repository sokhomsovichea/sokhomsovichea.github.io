import java.util.Scanner;

public class AverageofTen {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int counter = 0;
        int grade;
        int total = 0;
        int average;
        System.out.println("Enter the amount of time you want to input: ");
        int n = s.nextInt();

        while (counter<n){
            grade = s.nextInt();
            total += grade;
            counter++;
        }
        average = total / n;
        System.out.println("The Average is: "+average);
    }
}
