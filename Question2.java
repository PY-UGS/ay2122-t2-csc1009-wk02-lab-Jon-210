import java.util.Scanner;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Question2 {
    public static void main(String[] args){
        double num1 = 0, num2 = 0, num3 = 0, sum = 0, average = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        String str = input.nextLine();
        if (isNumber(str) == true){
            num1 = parseDouble(str);
            num2 = input.nextDouble();
            num3 = input.nextDouble();
            sum = num1 + num2 + num3;
            average = sum / 3;
            System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + average);
        }
        else{
            String[] strSplit = str.split(" ");

            for (int i = 0; i < strSplit.length; i++) {
                sum += Double.parseDouble(strSplit[i]);
            }
            average = sum / strSplit.length;
            System.out.println("The average of " + str + " is "+ average);
        }

    }

    static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false && s.charAt(i) != '.')
                return false;

        return true;
    }
}
