# CharacterCounter

`CharacterCounter` adalah aplikasi sederhana berbasis Java yang menghitung jumlah huruf besar dan huruf kecil dalam sebuah teks. Program ini menerima input dari pengguna, menganalisis teks, dan menampilkan hasil perhitungan jumlah huruf besar dan kecil.

## Struktur Proyek

Proyek ini memiliki tiga komponen utama:
1. **Interface `TextAnalyzer`** - Mendefinisikan metode untuk menganalisis teks dan menampilkan hasil.
2. **Kelas `TextInput`** - Menyimpan teks yang diinput oleh pengguna.
3. **Kelas `CharacterCounter`** - Menghitung jumlah huruf besar dan kecil, mengimplementasikan `TextAnalyzer`, dan mewarisi `TextInput`.

## Fitur

- **Input Teks**: Mengambil input berupa kata atau kalimat dari pengguna.
- **Analisis Huruf**: Menghitung jumlah huruf besar dan huruf kecil dalam teks.
- **Menampilkan Hasil**: Menampilkan jumlah huruf besar dan kecil yang ditemukan.
