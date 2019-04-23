import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        int a = scanner.nextInt();
        System.out.println("nhap b");
        int b = scanner.nextInt();
        System.out.println("UCLN " + a + " va " + b + " la: " + UCLN(a, b));
        System.out.println("BCNN" + a + " va " + b + " la: " + BCNN(a, b));
    }

    public static int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return UCLN(b, a % b);
    }

    public static int BCNN(int a, int b) {
        return (a * b)/ UCLN(a, b);
    }
}
