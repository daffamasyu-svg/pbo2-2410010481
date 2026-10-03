package id.ac.uniska.pbo2.p02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Perpustakaan {
    private List<Koleksi> daftarKoleksi = new ArrayList<>();
    private Map<String, Anggota> peminjamMap = new HashMap<>();

    public void tambah(Koleksi k) {
        daftarKoleksi.add(k);
    }

    public List<Koleksi> getDaftarKoleksi() {
        return daftarKoleksi;
    }

    public Koleksi cariKoleksi(String kode) {
        for (Koleksi k : daftarKoleksi) {
            if (k.getKode().equalsIgnoreCase(kode)) {
                return k;
            }
        }
        return null;
    }

    public List<Koleksi> cariJudul(String kataKunci) {
        List<Koleksi> hasil = new ArrayList<>();
        String keyword = kataKunci.toLowerCase();
        for (Koleksi k : daftarKoleksi) {
            if (k.getJudul().toLowerCase().contains(keyword)) {
                hasil.add(k);
            }
        }
        return hasil;
    }

    public boolean pinjam(String kode, Anggota anggota) {
        Koleksi k = cariKoleksi(kode);
        if (k != null && k.pinjam()) {
            peminjamMap.put(kode, anggota);
            return true;
        }
        return false;
    }

    public long kembalikan(String kode, int hariTerlambat) {
        Koleksi k = cariKoleksi(kode);
        if (k != null) {
            k.kembalikan();
            peminjamMap.remove(kode);
            return k.hitungDenda(hariTerlambat);
        }
        return 0;
    }

    public Anggota getPeminjam(String kode) {
        return peminjamMap.get(kode);
    }

    public long jumlahTersedia() {
        long count = 0;
        for (Koleksi k : daftarKoleksi) {
            if (k.getStatus() == StatusKoleksi.TERSEDIA) {
                count++;
            }
        }
        return count;
    }
}