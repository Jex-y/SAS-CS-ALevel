package Unit1.Hackerrank.MoreAboutStrings;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the full name");
        String name = input.nextLine();
        System.out.println(name.split(" ")[1]);
    }
}
