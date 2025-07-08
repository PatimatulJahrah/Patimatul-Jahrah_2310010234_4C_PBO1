package HabitTracker;

public class User {
    protected String nama;
    protected String email;

    public User(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public void tampilkanProfil() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }

    public void tampilkanPesan() {
        System.out.println("Halo pengguna!");
    }
}