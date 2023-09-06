import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap xau: ");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        long sum = 0;
        int i = 0;
        while (i < s.length()) {
            int ascii = (int) chars[i];
            if (ascii >= 48 && ascii <= 57) {
                int j = i + 1;
                int asci;
                if (j < s.length()) asci = (int) chars[j];
                else {
                    asci = 58;
                }
                while (asci >= 48 && asci <= 57 && j < s.length()) {
                    j++;
                    if (j < s.length()) asci = (int) chars[j];
                }
                int num = 0;
                int d = 1;
                for (int index = j - 1; index >= i; index--) {
                    int asc = (int) chars[index];
                    asc -= 48;
                    num += asc * d;
                    d *= 10;
                }
                if (i != 0 && chars[i - 1] == '-') sum -= num;
                else sum += num;
                i = j;
            }
            i++;
        }
        System.out.println("Tong la: " + sum);
    }
}