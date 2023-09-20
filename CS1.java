import java.util.Scanner;
public class CS1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int input_value;
    int squared_value;

    System.out.print("Enter the value: ");
    input_value = input.nextInt();
    
    squared_value = input_value * input_value;

    System.out.println(input_value + "**2=" + squared_value);
input.close();
}
    }
