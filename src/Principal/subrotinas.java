package Principal;

import java.util.Scanner;

public class subrotinas {

    static double menor(double n1, double n2) {
        if (n1 > n2) {
            return n2;
        } else {
            return n1;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);

        System.out.println("Digite o número 1:");
        double n1 = sc.nextDouble();
        System.out.println("Digite o número 2:");
        double n2 = sc.nextDouble();
        System.out.println("Digite o número 3:");
        double n3 = sc.nextDouble();

        double menor2 = menor(n2, n3);
        double menor1 = menor(n1, menor2);

        System.out.println("O menor número é: " + menor1);
    }
}
