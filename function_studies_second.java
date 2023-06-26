public class Main {
    public static void main(String[] args) {
//         info_date("Hello");
//         String java = "Java";
//         info_date(java);
//         info_date("World");

        int num = 7;
        int res1 = summa(5, num);

        int num2 = 9;
        int res2 = summa(8, num2);
        info_date(String.valueOf(res2));
    }

    public static int summa(int a, int b) {
        int res = a + b;
        String result = "Results: " + res;
        info_date(result);
        return res;
    }

    public static void info_date(String word) {
        System.out.print("\n" + word + "\n");
    }
}
