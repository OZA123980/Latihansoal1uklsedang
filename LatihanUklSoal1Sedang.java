package LatihanSoalUkl;

import java.util.Scanner;

public class LatihanUklSoal1Sedang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();
        long hasil = faktorial(n);
        System.out.println("Faktorial dari " + n + " adalah: " + hasil);
        input.close();
    }

    public static long faktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}
