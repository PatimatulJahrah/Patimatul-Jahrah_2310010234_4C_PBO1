package HabitTracker;

public class PenggunaAktif extends User {
    private String aktivitasTerakhir;

    public PenggunaAktif(String nama, String email, String aktivitasTerakhir) {
        super(nama, email);
        this.aktivitasTerakhir = aktivitasTerakhir;
    }

    public void tampilkanAktivitas() {
        tampilkanProfil();
        System.out.println("Aktivitas: " + aktivitasTerakhir);
    }
}
