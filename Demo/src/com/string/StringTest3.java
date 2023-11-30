import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");

        double number = sc.nextInt();

        String words = convertToWords(number);
        System.out.println(words);
    }

    private static final String[] units = {"", "千", "百", "十", ""};
    private static final String[] digits = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

    public static String convertToWords(double number) {
        long integerPart = (long) number;
        int decimalPart = (int) (Math.round((number - integerPart) * 100));

        if (integerPart == 0) {
            return digits[0] + "元" + convertDecimalToWords(decimalPart);
        }

        String integerPartWords = convertIntegerToWords(integerPart) + "元";
        String decimalPartWords = convertDecimalToWords(decimalPart);

        return integerPartWords + decimalPartWords;
    }

    private static String convertIntegerToWords(long number) {
        if (number == 0) {
            return digits[0];
        }

        StringBuilder words = new StringBuilder();
        int unitIndex = 0;

        while (number > 0) {
            int digit = (int) (number % 10);
            words.insert(0, digits[digit] + units[unitIndex]);
            number /= 10;
            unitIndex++;
        }

        return words.toString();
    }

    private static String convertDecimalToWords(int number) {
        if (number == 0) {
            return "整";
        }

        String decimalWords = convertIntegerToWords(number);
        if (number < 10) {
            decimalWords = "零" + decimalWords;
        }

        return decimalWords + "分";
    }


}