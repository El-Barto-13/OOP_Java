package OOP_HW6;

import java.util.Scanner;

public class InputReader {

    public String readInput(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}