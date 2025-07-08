package HabitTracker;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Habittracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Kebiasaan> daftarKebiasaan = new ArrayList<>();
        System.out.println("=== Selamat Datang di Aplikasi Habit Tracker ===");
        
        PenggunaAktif pengguna = new PenggunaAktif("Patimatul Jahrah", "patimatul@uniska.ac.id", "Login Hari Ini");

        pengguna.tampilkanPesan();      
        pengguna.tampilkanAktivitas();  
        
        int pilihan = 0;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Tambah Kebiasaan");
            System.out.println("2. Lihat Semua Kebiasaan");
            System.out.println("3. Hapus Kebiasaan");
            System.out.println("4. Keluar");
            
          try {
                System.out.print("Pilih menu (1-4): ");
                pilihan = input.nextInt();
                input.nextLine(); 

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan nama kebiasaan: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan deskripsi: ");
                        String deskripsi = input.nextLine();
                        Kebiasaan k = new Kebiasaan(nama, deskripsi);
                        daftarKebiasaan.add(k);
                        System.out.println("✅ Kebiasaan berhasil ditambahkan.");
                        break;
                        
                    case 2:
                        if (daftarKebiasaan.isEmpty()) {
                            System.out.println("⚠ Belum ada kebiasaan yang ditambahkan.");
                        } else {
                            System.out.println("📋 Daftar Kebiasaan:");
                            for (int i = 0; i < daftarKebiasaan.size(); i++) {
                                System.out.println((i + 1) + ". " + daftarKebiasaan.get(i).getNama());
                            }
                        }
                        break;
                        
                         case 3:
                        System.out.print("Masukkan nomor kebiasaan yang ingin dihapus: ");
                        int hapus = input.nextInt();
                        if (hapus > 0 && hapus <= daftarKebiasaan.size()) {
                            daftarKebiasaan.remove(hapus - 1);
                            System.out.println("🗑 Kebiasaan berhasil dihapus.");
                        } else {
                            System.out.println("❌ Nomor tidak valid.");
                        }
                        break;
                        
                        case 4:
                        System.out.println("👋 Terima kasih telah menggunakan Habit Tracker!");
                        break;

                        default:
                        System.out.println("❌ Pilihan tidak tersedia.");
                    }
            } catch (InputMismatchException e) {
                System.out.println("❌ Input harus berupa angka!");
                input.nextLine(); // bersihkan buffer
            }

        } while (pilihan != 4);

        input.close();
    }
    }
    
    
}
