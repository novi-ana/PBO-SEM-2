package Project_UTS_Asekk;
public class Dosen {
    private String nip;
    private String nama;
    private Mahasiswa[] mahas;

    public Dosen(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public String getNIP() {
        return nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public Mahasiswa[] getMahas() {
        return mahas;
    }

    public void setMahas(Mahasiswa[] mahas) {
        this.mahas = mahas;
    }
}

    
