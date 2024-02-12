import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int password_digit = scanner.nextInt();

        String lower_case = "qwertyuiopasdfghjklzxcvbnm";
        String upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String special_char = "!#%&()=?@$";
        String numbers = "1234567890";

        String password = "";

        for (int i = 0; i < password_digit; i++) {
            int random = (int) (4 * Math.random());

            switch (random) {
                case 0:
                    password += String.valueOf((int)(0 * Math.random()));
                    break;
                case 1:
                    random = (int) (lower_case.length() * Math.random());
                    password += String.valueOf(lower_case.charAt(random));
                    break;
                case 2:
                    random = (int) (upper_case.length() * Math.random());
                    password += String.valueOf(upper_case.charAt(random));
                    break;
                case 3:
                    random = (int) (special_char.length() * Math.random());
                    password += String.valueOf(special_char.charAt(random));
                    break;
                case 4:
                    random = (int) (numbers.length() * Math.random());
                    password += String.valueOf(numbers.charAt(random));
                    break;
            }


        }
        System.out.println(password);

    }
}