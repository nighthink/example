import java.util.Scanner;

public class ComputAreaWithConsoleInput{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        System.out.println("Please Enter the R: ");
        double S = R*R*3.14;
        System.out.println("The area for the circle of radius " + R + "is " + S);
    }
}