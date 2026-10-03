package id.ac.uniska.pbo2.p02;

public class Skripsi extends Koleksi {
    private String penulis;
    private String programStudi;

    public Skripsi(String kode, String judul, int tahunTerbit, String penulis, String programStudi) {
        super(kode, judul, tahunTerbit);
        this.penulis = penulis;
        this.programStudi = programStudi;
    }

    @Override
    public int batasHariPinjam() { return 0; }

    @Override
    public long hitungDenda(int hariTerlambat) { return 0L; }

    @Override
    public boolean pinjam() {
        return false; // Skripsi hanya dibaca di tempat, tidak boleh dipinjam keluar
    }

    @Override
    public String keterangan() {
        return "Skripsi karya " + penulis + " (" + programStudi + ")";
    }
}
