public class Main {
    public static void main(String[] args) {
//         info_date("Hello");
//         String java = "Java";
//         info_date(java);
//         info_date("World");

        int num = 7;
        summa(5, num);

        int num2 = 9;
        summa(8, num2);

        int num3 = 11;
        summa(7, num3);
    }

    public static void summa(int a, int b) {
        int res = a + b;
        String result = "Results: " + res;
        info_date(result);
    }

    public static void info_date(String word) {
        System.out.print("\n" + word + "\n");
    }
}