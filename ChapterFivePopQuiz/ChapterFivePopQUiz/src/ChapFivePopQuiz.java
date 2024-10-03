import java.util.Scanner;
public class ChapFivePopQuiz {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        float num1, num2;
        System.out.println("Enter the first number");
        num1 = keyboard.nextFloat();
        System.out.println("Enter the second number");
        num2 = keyboard.nextFloat();
        addition(num1, num2);
        subtraction(num1, num2);
    }
    public static void addition(float num1, float num2)
    {
        float answer = num1 + num2;
        System.out.println("Sum: " + answer);
    }
    public static void subtraction(float num1, float num2)
    {
        float answer = num1 - num2;
        System.out.println("Difference: " + answer);
    }


}
