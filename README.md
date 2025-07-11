
# 🧭 Habit Tracker – Proyek Akhir Pemrograman Berbasis Objek 1

Ini adalah aplikasi **Habit Tracker berbasis Java** yang dibuat sebagai **tugas akhir mata kuliah Pemrograman Berbasis Objek 1 (PBO 1)**.

Aplikasi ini membantu pengguna mencatat, melihat, dan menghapus kebiasaan harian mereka, sekaligus menerapkan prinsip-prinsip OOP dalam implementasinya.

---

## 📌 Fitur Aplikasi

- ✅ Tambah kebiasaan harian
- 📋 Lihat semua kebiasaan yang tersimpan
- 🗑 Hapus kebiasaan berdasarkan nomor
- 👤 Menampilkan profil pengguna aktif
- 🧾 Cetak laporan kebiasaan
- ⚠ Penanganan error untuk input yang tidak valid

---

## 📦 Struktur Class dan Konsep OOP

### ✅ 1. Class & Object
- Class: `Kebiasaan`, `User`, `PenggunaAktif`, `Tracker`, `HabitTracker`
- Interface: `Laporan`
- Object dibuat dari class, misalnya:
```java
Kebiasaan k = new Kebiasaan("Shalat Tahajud", "Bangun jam 3 pagi");
```

### ✅ 2. Encapsulation
- Atribut `nama`, `deskripsi` di `Kebiasaan` disembunyikan (private)
- Akses melalui method getter/setter:
```java
private String nama;
public String getNama() { return nama; }
```

### ✅ 3. Inheritance
- `PenggunaAktif` mewarisi `User`:
```java
public class PenggunaAktif extends User { ... }
```

### ✅ 4. Polymorphism
- Method `tampilkanPesan()` bisa di-override
- Penggunaan interface `Laporan` diimplementasi oleh `Tracker`

### ✅ 5. Interface
- `Laporan` digunakan untuk mencetak laporan kebiasaan:
```java
public interface Laporan {
    void cetakLaporan();
}
```

### ✅ 6. ArrayList & Perulangan
- `ArrayList<Kebiasaan>` digunakan untuk menyimpan kebiasaan
- Perulangan digunakan saat mencetak daftar kebiasaan:
```java
for (Kebiasaan k : kebiasaanList) { ... }
```

### ✅ 7. Seleksi & Error Handling
- `switch` digunakan untuk menu
- `try-catch` untuk menangani input yang bukan angka:
```java
try {
    pilihan = input.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Input harus berupa angka!");
}
```

---

## 🧪 Contoh Tampilan Program (CLI)

```text
=== Selamat Datang di Aplikasi Habit Tracker ===
Nama: Patimatul Jahrah
Email: Fatzah052005@gmail.com
Aktivitas: Login Hari Ini

--- Menu ---
1. Tambah Kebiasaan
2. Lihat Semua Kebiasaan
3. Hapus Kebiasaan
4. Keluar
Pilih menu (1-4):
```

---

## 📁 Struktur File

```
habittracker/
├── HabitTracker.java
├── Kebiasaan.java
├── User.java
├── PenggunaAktif.java
├── Tracker.java
└── Laporan.java
```

---

## 🧑‍💻 Cara Menjalankan

```bash
javac habittracker/*.java
java habittracker.HabitTracker
```

---

## 📚 Konsep PBO yang Dicapai

| No  | Materi         |  Status |
| :-: | -------------- | :-----: |
|  1  | Class          |   ✅    |
|  2  | Object         |   ✅    |
|  3  | Atribut        |   ✅    |
|  4  | Constructor    |   ✅    |
|  5  | Mutator        |   ✅    |
|  6  | Accessor       |   ✅    |
|  7  | Encapsulation  |   ✅    |
|  8  | Inheritance    |   ✅    |
|  9  | Polymorphism   |   ✅    |
| 10  | Interface      |   ✅    |
| 11  | Seleksi        |   ✅    |
| 12  | Perulangan     |   ✅    |
| 13  | IO Sederhana   |   ✅    |
| 14  | ArrayList      |   ✅    |
| 15  | Error Handling |   ✅    |

---

## 👤 Pembuat

- **Nama:** Patimatul Jahrah  
- **NPM:** 2310010234

---


