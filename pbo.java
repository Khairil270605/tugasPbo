import java.util.Scanner;

public class pbo {
    public static void main(String[] args) {
        // Variabel dan Tipe Data
        int angka = 5;          // Variabel integer
        double pi = 3.14159;    // Variabel double
        char huruf = 'A';       // Variabel char
        String nama = "Khairil";   // Variabel string

        // Menampilkan variabel
        System.out.println("Angka: " + angka);
        System.out.println("Pi: " + pi);
        System.out.println("Huruf: " + huruf);
        System.out.println("Nama: " + nama + "\n");

        // Loop For
        System.out.println("Loop For:");
        for (int i = 0; i < angka; i++) {
            // If Statement
            if (i % 2 == 0) {
                System.out.println(i + " adalah angka genap");
            } else {
                System.out.println(i + " adalah angka ganjil");
            }
        }
        System.out.println();

        // Loop While
        System.out.println("Loop While:");
        int j = 0;
        while (j < angka) {
            System.out.println("Nilai j: " + j);
            j++;
        }
        System.out.println();

        // Loop Do-While
        System.out.println("Loop Do-While:");
        int k = 0;
        do {
            System.out.println("Nilai k: " + k);
            k++;
        } while (k < angka);
        System.out.println();

        // Array Satu Dimensi
        System.out.println("Array Satu Dimensi:");
        int[] arrSatuDimensi = {1, 2, 3, 4, 5};
        for (int l = 0; l < arrSatuDimensi.length; l++) {
            System.out.println("arrSatuDimensi[" + l + "] = " + arrSatuDimensi[l]);
        }
        System.out.println();

        // Array Multidimensi
        System.out.println("Array Multidimensi:");
        int[][] arrMultiDimensi = {{1, 2, 3}, {4, 5, 6}};
        for (int m = 0; m < arrMultiDimensi.length; m++) {
            for (int n = 0; n < arrMultiDimensi[m].length; n++) {
                System.out.println("arrMultiDimensi[" + m + "][" + n + "] = " + arrMultiDimensi[m][n]);
            }
        }
        System.out.println();

        // Input dan Output
        System.out.println("Input dan Output:");
        Scanner input = new Scanner(System.in);
        int inputAngka;
        System.out.print("Masukkan angka: ");
        inputAngka = input.nextInt();
        System.out.println("Anda memasukkan angka: " + inputAngka + "\n");

        // Comment
        // Ini adalah contoh komentar dalam Java
        /*           */
    }
}
