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

    }
    
    
}
