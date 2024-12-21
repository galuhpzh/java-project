# Kalkulator Sederhana dalam Java

Proyek ini adalah sebuah kalkulator sederhana yang diimplementasikan dalam Java. Kalkulator ini menyediakan operasi aritmatika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian melalui antarmuka berbasis konsol.

## Fitur

- **Penjumlahan (+)**: Menjumlahkan dua angka.
- **Pengurangan (-)**: Mengurangi satu angka dari angka lainnya.
- **Perkalian (*)**: Mengalikan dua angka.
- **Pembagian (/)**: Membagi satu angka dengan angka lainnya (menangani pembagian dengan nol).
- **Keluar**: Opsi untuk menghentikan program.

## Cara Menggunakan

1. Clone atau unduh repository ini.
2. Kompilasi file `Calculator.java` menggunakan compiler Java.
3. Jalankan program yang sudah dikompilasi.
4. Ikuti instruksi pada konsol untuk melakukan perhitungan.

### Pilihan Menu:
```
+-----------------------------------------+
| Kalkulator Sederhana                    |
+-----------------------------------------+
| 1. Penjumlahan  (+) | 2. Pengurangan  (-) |
| 3. Perkalian    (*) | 4. Pembagian    (/) |
| 5. Keluar                                 |
+-----------------------------------------+
```

### Contoh Input:
- Masukkan pilihan operasi (1/2/3/4/5).
- Masukkan dua angka untuk operasi yang dipilih.
- Lihat hasil yang ditampilkan dalam format yang rapi.

## Persyaratan

- Java Development Kit (JDK) 8 atau lebih baru

## Struktur Kode

Program ditulis dalam satu file:
- `Calculator.java`: Berisi kelas utama `Calculator` dengan logika untuk input berbasis menu, perhitungan, dan penanganan kesalahan.

## Contoh Eksekusi

```
+-----------------------------------------+
| Kalkulator Sederhana                    |
+-----------------------------------------+
| 1. Penjumlahan  (+) | 2. Pengurangan  (-) |
| 3. Perkalian    (*) | 4. Pembagian    (/) |
| 5. Keluar                                 |
+-----------------------------------------+
Masukkan pilihan operasi (1/2/3/4/5): 1
Masukkan angka pertama: 10
Masukkan angka kedua: 20

Hasil penjumlahan dari 10 + 20 adalah: 30
```

## Penanganan Kesalahan

- Memastikan pilihan menu yang valid dengan meminta input hingga pilihan yang benar dimasukkan.
- Memvalidasi input numerik untuk perhitungan.
- Menangani pembagian dengan nol dengan menampilkan pesan yang sesuai.

## Peningkatan di Masa Depan

- Menambahkan dukungan untuk operasi lain (misalnya, modulus, eksponensial).
- Menyediakan antarmuka pengguna grafis (GUI).
- Memungkinkan penggabungan beberapa operasi.

## Lisensi

Proyek ini bersifat open-source dan tersedia di bawah [Lisensi MIT](LICENSE).
