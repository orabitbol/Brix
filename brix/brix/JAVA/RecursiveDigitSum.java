public class RecursiveDigitSum {
    public static String RecursiveDigitSum(String n) {
        if (n.length() == 1) {
            return n;
        } else {
            int sum = 0;

            for(int i = 0; i < n.length(); ++i) {
                sum += Character.getNumericValue(n.charAt(i));
            }

            return RecursiveDigitSum(Integer.toString(sum));
        }
    }

    public static int RecursiveDigitSum(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            int res;
            for(res = 0; n > 0; n /= 10) {
                res += n % 10;
            }

            return RecursiveDigitSum(res);
        }
    }

    public static void main(String[] args) {
        String n = "3456";
        n = RecursiveDigitSum(n);
        System.out.println(n);
    }
}
