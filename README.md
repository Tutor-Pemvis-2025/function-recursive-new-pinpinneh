[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/DcSCpMVp)
# Soal Fungsi Rekursif (Total 100)

Buatlah satu algoritma di Flowgorithm yang melibatkan **fungsi rekursif** untuk kasus berikut:

## Permasalahan 

Sebuah program menerima input sebuah **bilangan bulat positif** (N) dari user.
Program harus membuat sebuah **fungsi rekursif** bernama `HitungRekursif` untuk melakukan hal-hal berikut.

### Bagian A: Pendefinisian Fungsi (30 poin)

Definisikan fungsi rekursif `HitungRekursif` yang menerima satu parameter bilangan bulat positif, misal `angka`, dan mengembalikan (return) sebuah nilai bilangan bulat.

### Bagian B: Kasus Basis dan Rekursif (40 poin)

Dalam fungsi `HitungRekursif`:
* **Kasus Basis (Base Case):** Jika `angka` adalah 1, fungsi mengembalikan nilai 1.
* **Kasus Rekursif (Recursive Case):** Jika `angka` lebih besar dari 1, fungsi mengembalikan hasil penjumlahan `angka` dengan pemanggilan fungsi rekursif `HitungRekursif` untuk nilai `angka - 1`.

 **Catatan:** Fungsi ini akan menghitung jumlah deret bilangan dari 1 hingga $N$ (misalnya, $1 + 2 + 3 + \dots + N$).

### Bagian C: Pemanggilan dan Tampilan (30 poin)

Pada program utama (**`Main`**), panggil fungsi `HitungRekursif` dengan bilangan bulat positif yang diinput ($N$) dan tampilkan hasilnya.

---

### Input

User memasukkan satu buah bilangan bulat positif, misal:

Masukkan bilangan bulat positif (N): 5

### Expected Output

Contoh output untuk beberapa kasus:

#### Contoh 1

Input:

5

Output:

Bilangan yang dimasukkan (N): 5
Hasil perhitungan rekursif (1+2+3+4+5): 15

#### Contoh 2

Input:

1

Output:

Bilangan yang dimasukkan (N): 1
Hasil perhitungan rekursif (1): 1

#### Contoh 3

Input:

3

Output:

Bilangan yang dimasukkan (N): 3
Hasil perhitungan rekursif (1+2+3): 6

---



