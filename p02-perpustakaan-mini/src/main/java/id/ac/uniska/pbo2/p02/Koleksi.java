package id.ac.uniska.pbo2.p02;

public abstract class Koleksi implements BisaDipinjam {
    private String kode;
    private String judul;
    private int tahunTerbit;
    private StatusKoleksi status;

    public Koleksi(String kode, String judul, int tahunTerbit) {
        if (judul == null || judul.trim().isEmpty()) {
            throw new IllegalArgumentException("Judul tidak boleh kosong");
        }
        this.kode = kode;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.status = StatusKoleksi.TERSEDIA;
    }

    public String getKode() { return kode; }
    public String getJudul() { return judul; }
    public int getTahunTerbit() { return tahunTerbit; }
    public StatusKoleksi getStatus() { return status; }
    public void setStatus(StatusKoleksi status) { this.status = status; }

    @Override
    public boolean pinjam() {
        if (status == StatusKoleksi.TERSEDIA) {
            status = StatusKoleksi.DIPINJAM;
            return true;
        }
        return false;
    }

    @Override
    public void kembalikan() {
        status = StatusKoleksi.TERSEDIA;
    }

    public abstract String keterangan();
    public abstract int batasHariPinjam();
    public abstract long hitungDenda(int hariTerlambat);

    @Override
    public String toString() {
        return "[" + kode + "] " + judul + " (" + tahunTerbit + ") - " + status;
    }
}