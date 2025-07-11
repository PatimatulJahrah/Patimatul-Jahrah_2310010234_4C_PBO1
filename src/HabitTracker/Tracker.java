package HabitTracker;

import java.util.ArrayList;

public class Tracker implements Laporan {
    private ArrayList<Kebiasaan> kebiasaanList;

    public Tracker() {
        kebiasaanList = new ArrayList<>();
    }

    public void tambah(Kebiasaan k) {
        kebiasaanList.add(k);
    }

    @Override
    public void cetakLaporan() {
        System.out.println("Laporan Semua Kebiasaan:");
        for (Kebiasaan k : kebiasaanList) {
            System.out.println("- " + k.getNama() + ": " + k.getDeskripsi());
        }
    }
}