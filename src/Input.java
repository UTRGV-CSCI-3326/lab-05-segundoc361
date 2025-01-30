import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // user name
        String namestring;
        System.out.print("Enter your name:");
        namestring = scanner.nextLine();

        // user age
        int ageint;
        System.out.print("Enter your age:");
        ageint = scanner.nextInt();

        // users weight
        float weightfloat;
        System.out.print("Enter your weight:");
        weightfloat = scanner.nextFloat();

        // user smoker question true or false
        boolean smokerboolean;
        System.out.print("Enter 'True' if you are a smoker otherwise enter 'false':");
        smokerboolean = scanner.nextBoolean();


        System.out.println("You enter your name is:" + namestring);
        System.out.println("You enter your age is:" + ageint);
        System.out.println("You enter your weight is:" + weightfloat);
        System.out.println("You enter your smoker state is:" + smokerboolean);
    }
}
