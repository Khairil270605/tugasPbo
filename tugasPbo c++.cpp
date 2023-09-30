#include <iostream>
using namespace std;

int main() {
    // Variabel dan Tipe Data
    int angka = 5;          // Variabel integer
    double pi = 3.14159;    // Variabel double
    char huruf = 'A';       // Variabel char
    string nama = "Khairil";   // Variabel string

    // Menampilkan variabel
    cout << "Angka: " << angka << endl;
    cout << "Pi: " << pi << endl;
    cout << "Huruf: " << huruf << endl;
    cout << "Nama: " << nama << endl << endl;

    // Loop For
    cout << "Loop For:" << endl;
    for (int i = 0; i < angka; i++) {
        // If Statement
        if (i % 2 == 0) {
            cout << i << " adalah angka genap" << endl;
        } else {
            cout << i << " adalah angka ganjil" << endl;
        }
    }
    cout << endl;

    // Loop While
    cout << "Loop While:" << endl;
    int j = 0;
    while (j < angka) {
        cout << "Nilai j: " << j << endl;
        j++;
    }
    cout << endl;

    // Loop Do-While
    cout << "Loop Do-While:" << endl;
    int k = 0;
    do {
        cout << "Nilai k: " << k << endl;
        k++;
    } while (k < angka);
    cout << endl;

    // Array Satu Dimensi
    cout << "Array Satu Dimensi:" << endl;
    int arrSatuDimensi[] = {1, 2, 3, 4, 5};
    for (int l = 0; l < sizeof(arrSatuDimensi) / sizeof(arrSatuDimensi[0]); l++) {
        cout << "arrSatuDimensi[" << l << "] = " << arrSatuDimensi[l] << endl;
    }
    cout << endl;

    // Array Multidimensi
    cout << "Array Multidimensi:" << endl;
    int arrMultiDimensi[2][3] = {{1, 2, 3}, {4, 5, 6}};
    for (int m = 0; m < 2; m++) {
        for (int n = 0; n < 3; n++) {
            cout << "arrMultiDimensi[" << m << "][" << n << "] = " << arrMultiDimensi[m][n] << endl;
        }
    }
    cout << endl;

    // Input dan Output
    cout << "Input dan Output:" << endl;
    int inputAngka;
    cout << "Masukkan angka: ";
    cin >> inputAngka;
    cout << "Anda memasukkan angka: " << inputAngka << endl << endl;

    // Comment
    // Ini adalah contoh komentar dalam C++
    /*					*/
    return 0;
}

