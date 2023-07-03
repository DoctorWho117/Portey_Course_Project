import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FibonacciNumbers numbers = new FibonacciNumbers();
        Control control = new Control(numbers);
        UserView userView = new UserView(control);
    }
}