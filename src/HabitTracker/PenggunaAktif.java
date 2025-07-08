package HabitTracker;

public class PenggunaAktif {
    private String aktivitasTerakhir;
    
    public PenggunaAktif(String nama, String email, String aktivitasTerakhir){
        super(nama, email);
        this.aktivitasTerakhir = aktivitasTerakhir;
    }
    public void tampilanAktivitas(){
        tampilkanProfil();
        System.out.println("Aktivitas : " + aktivitasTerakhir);
    }
}