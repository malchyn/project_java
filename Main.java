import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // data type, text
        /*
        System.out.println("Hello\"\n\tworld!");
        int a = 5;
        float b = 3.1415f;
        double c = 3.1415926535897932384626433832795d;
        char d = 'A';
        byte i = 127;
        short f = 1000;
        long g = 2133123254457543544l;
        boolean True = true;
        String user_name = "Poseidonskiy!";
        System.out.println(user_name);

        // input text

        Scanner scan = new Scanner(System.in);
        System.out.print("Input Something: ");
        String something = scan.nextLine();
        System.out.println("Hello, " + something);
         */
        // input data
        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Something numbers: ");
        int num = scan.nextInt();
        */

        // Calculator v 1.0 blyat p.s My first normal code, da ny nachyi!!!
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("This first number: ");
        float first = scan.nextFloat();
        System.out.println("This second number: ");
        float second = scan.nextFloat();
        float res = first + second;
        float res1 = first - second;
        float res2 = first * second;
        float res3 = first / second;
        System.out.println("Result sum this numbers: " + res);
        System.out.println("Result subtraction this numbers: " + res1);
        System.out.println("Result multiplication this numbers: " + res2);
        System.out.println("Result division this numbers: " + res3);
        */


        // if,else,switch-case and some else
        /*
        int a = 10, b = 10, c = 100; respon.equals(“Q”) || respon.equals(„q”)
        if(a != b){
            System.out.println("Degan");
        }
        else if(a == b) {
            System.out.println(c);
        }
        else {
            System.out.println("SCO she?");
        }

        if (a != b && a > b) {
            // Код буде виконано, якщо і перша і друга умова

        }

        if (a < b || a == b) {
            // Код буде виконано, якщо або перша або друга умова

        }
         */
        /*
        int x = 23;
        switch (x) { // Перевіряємо змінну x
            case 1: // Якщо змінна дорівнюватиме 1, то тут спрацює код
                // Може бути безліч рядків, а не тільки один
                System.out.print ("Змінна дорівнює 1");
                break; // Вказуємо кінець коду для цієї перевірки
            case 56: // Якщо змінна дорівнюватиме 56, то тут спрацює код
                // Може бути безліч рядків, а не тільки один
                System.out.print ("Змінна дорівнює 56");
                break; // Вказуємо кінець коду для цієї перевірки

            // За аналогією таких перевірок може бути безліч
            // Також можна додати перевірку, яка спрацює у разі
            // якщо всі інші перевірки не спрацюють
            default:
                System.out.print ("Щось інше");
                break; // Можна і не ставити, тому що це остання умова
        }
         */
        /*
        int x = 3, a = 12;
        int res = x < a ? (x + a) : (x - a);
        System.out.println(res);
         */
        // Calculator v 2.0
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 number: ");
        double num = scanner.nextDouble();

        System.out.println("2 number: ");
        double num1 = scanner.nextDouble();



        System.out.println("What do you want to do?");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                double res = num + num1;
                System.out.println("Result: " + res);
                break;
            case "-":
                double res1 = num - num1;
                System.out.println("Result: " + res1);
                break;
            case "*":
                double res2 = num * num1;
                System.out.println("Result: " + res2);
                break;
            case "/":
                double res3 = num / num1;
                if (res3 == 0)
                    System.out.println("Error, they did not care for the German");
                else {
                    System.out.println("Result: " + res3);
                }
                    break;
            case "%":
                double res4 = num % num1;
                if (res4 == 0)
                    System.out.println("Error, they did not care for the German");
                else {
                    System.out.println("Result: " + res4);
                }
                    break;
            default:
                System.out.println("I'm writing norms, or I'll kill them");
        }
        */
        // While, for, do while
        /*
        int j = 1;

        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        int x = 13;
        do {
            x--;
            System.out.println(x);
        } while (x > 10);


        for (int i = 100; i > 10; i/=2)
            System.out.println(i);

         byte j = 100;
         for (int i = 0; i < 10; i++) {
             if (i == 5)
                 break; // return
             System.out.println(i);
         }

        // I don't realized what i write

        int a = 100;
        do {
             a = a / 2;
             if (a == 50) {
                 a++;
                 System.out.println("idk what i want write" + a);
             }
             else {
                 a = a * 5;
                 System.out.println("idk " + a);
             }
             System.out.println(a);
         } while (a < 1935);

        */

        //Array
        /*
        int[] num = new int[4];
        num[0] = 21;
        num[1] = 2;
        num[2] = 8;
        num[3] = 7;
        int res = num[0] + num[2];
        System.out.println(num[1] + " Some " + res);

        char[] stroka;
        int[] nums2 = new int[] { 1, 2, 3, 4 };
        System.out.println(nums2[1]);
        */
        /*
        int[] a = new int[] {-14, 23, 9, -4, 12, -1};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Min element: " + min);
        */
        /*
        float[] num = new float[] {5.0f, 6.45f, 89.984f};
        for(int i = 0; i < num2.length; i++) {
                System.out.println("Element: " + num[i]);
        }
        */
        double[][] number = new double[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}}; // multidimensional array

        System.out.println(number[1][0]);
        String[][] s = new String[1][2];
        s[0][0] = "Hello";
        s[0][1] = "World";
        System.out.println(s[0][0] + " " + s[0][1] + "!!!");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }
    }
}
