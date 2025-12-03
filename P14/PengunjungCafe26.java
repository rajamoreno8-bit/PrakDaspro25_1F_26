public class PengunjungCafe26 {

    public static void main(String[] args) {
        daftarpengunjung("Ali", "Budi", "Citra");
    }

    static void daftarpengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }
}
