import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a palindrome: ");
        long input = s.nextLong();
        if (isPalindrome(input))
        {
            System.out.printf("%d bir palindromdur.", input);
        }
        else
        {
            System.out.printf("%d bir palindrom değildir.", input);
        }

    }

    static boolean isPalindrome(long number)
    {
        long number_cp = number;
        long palindrome = 0;
        while(number_cp != 0)
        {
            palindrome *= 10;
            palindrome += number_cp % 10;
            number_cp /= 10;
        }
        if (number == palindrome)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
