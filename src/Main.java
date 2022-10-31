import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n, r;
        long i;
        long total1 = 1, total2 = 1, total3 = 1;

        System.out.println("(n,r) Yapıdaki Kombinasyon için");
        Scanner input = new Scanner(System.in);

        System.out.print("'n' Değerini Giriniz:");
        n = input.nextLong();

        System.out.print("'r' Değerini Giriniz: ");
        r = input.nextInt();

        if (n > 1) {
            for (i = 1; i <= n; i++) {

                total1 = total1 * i;

            }

            for (i = 1; i <= r; i++) {

                total2 = total2 * i;

            }

            for (i = 1; i <= (n - r); i++) {

                total3 = total3 * i;
            }

            System.out.print(n + " ve " + r + " Kombinasyonu: ");
            System.out.println(total1 / (total2 * total3));

        } else {
            System.out.println("Hatalı Giriş Yaptınız");
        }



    }
}
