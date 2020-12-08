package numberwithspaces;

import java.util.Scanner;

public class NumberWithSpaces {

    public static void main(String[] args) {

        System.out.println("Please type 5 Digit Number");

        Scanner spacedNum = new Scanner(System.in);
        int input = spacedNum.nextInt();
        int digit1, digit2, digit3, digit4, digit5;

        digit1 = (input / 10000) % 10;
        digit2 = (input / 1000) % 10;
        digit3 = (input / 100) % 10;
        digit4 = (input / 10) % 10;
        digit5 = (input / 1) % 10;

        System.out.print(digit1 + "            " + digit2 + "            " + digit3 + "            " + digit4 + "            " + digit5 + "            ");
    }

}

/**
 *
 * @author 30023737
 */
