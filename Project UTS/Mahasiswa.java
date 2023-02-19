package Project_UTS_Asekk;
import javax.swing.JOptionPane;
public class Mahasiswa {
    private String nama, prodi;
    private int nim;
    private String nilaiA, nilaiB, nilaiC, nilaiD, nilaiE, nilaiF, nilaiG;
    private double ipsMahas;
    public int jumMatkul, jumAmbilnya;
    private String tambahMatkul, tambahMatkul2;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNilaiA() {
        return nilaiA;
    }

    public void setNilaiA(String nilaiA) {
        this.nilaiA = nilaiA;
    }

    public String getNilaiB() {
        return nilaiB;
    }

    public void setNilaiB(String nilaiB) {
        this.nilaiB = nilaiB;
    }

    public String getNilaiC() {
        return nilaiC;
    }

    public void setNilaiC(String nilaiC) {
        this.nilaiC = nilaiC;
    }

    public String getNilaiD() {
        return nilaiD;
    }

    public void setNilaiD(String nilaiD) {
        this.nilaiD = nilaiD;
    }

    public String getNilaiE() {
        return nilaiE;
    }

    public void setNilaiE(String nilaiE) {
        this.nilaiE = nilaiE;
    }

    public String getNilaiF() {
        return nilaiF;
    }

    public void setNilaiF(String nilaiF) {
        this.nilaiF = nilaiF;
    }

    public String getNilaiG() {
        return nilaiG;
    }

    public void setNilaiG(String nilaiG) {
        this.nilaiG = nilaiG;
    }

    public double getIpsMahas() {
        return ipsMahas;
    }

    public void setIpsMahas(double ipsMahas) {
        this.ipsMahas = ipsMahas;
    }

    public double tentuMatkul(double hitungIPS) { // didalam method ini dignakan untuk menentukan apakah ips yang didapat kurang dari 3, lebih dari 3, atau sama dengan 3.
        if (hitungIPS < 3) {
            jumMatkul = 0; // jika ips yang didapat kurang dari 3 maka tidak bisa menambah matkul 
        } else if (hitungIPS >= 3.00 && hitungIPS < 3.5) {
            jumMatkul = 2;
        } else {
            jumMatkul = 4;
        }
        return jumMatkul;
    }

    public void ambilMatkul(double jumMatkul) { // pada method ini digunakan untuk menampilkan kalimat berdasarkan jumlah ips yg diterima
        if (jumMatkul == 0) { // jika jumMatkul = 0  maka kalimat yg akan muncul seperti dibawah ini yang berarti ips nya kurang dari 3  dan berarti tidak bisa menambah matkul
            JOptionPane.showMessageDialog(null, "ANDA MENDAPATKAN PAKET SEBESAR 20 SKS");
            JOptionPane.showMessageDialog(null, "ANDA TIDAK DAPAT MENAMBAH KARENA IPS ANDA KURANG DARI 3.00");
            System.out.println("DAFTAR MATA KULIAH YANG DIAMBIL : ");
            System.out.println("1. PENDIDIKAN PANCASILA ");
            System.out.println("2. PEMROGRAMAN BERBASIS OBJEK 1 ");
            System.out.println("3. PENDIDIKAN AGAMA ");
            System.out.println("4. STATISTIKA ");
            System.out.println("5. KALKULUS ");
            System.out.println("6. DASAR - DASAR KOMPUTER ");
            System.out.println("7. DASAR KOMUNIKASI KOMPUTER DAN JARINGAN ");
            System.out.println("8. FCH 2 ");
        } else if (jumMatkul == 2) { // jika matkul = 2 maka akan menampilkan kalimat yang sama seperti diatas bedanya user dapat menambah jumlah matkul 
            JOptionPane.showMessageDialog(null, "ANDA MENDAPATKAN PAKET SEBESAR 20 SKS");
            JOptionPane.showMessageDialog(null, "ANDA DAPAT MENAMBAH MATA KULIAH TAMBAHAN DENGAN TOTAL : " + jumMatkul + " sks"); 
        } else if (jumMatkul == 4) {
            JOptionPane.showMessageDialog(null, "ANDA MENDAPATKAN PAKET SEBESAR 20 SKS");
            JOptionPane.showMessageDialog(null, "ANDA DAPAT MENAMBAH MATA KULIAH TAMBAHAN DENGAN TOTAL : " + jumMatkul + " sks");
        }
    }

    public void tambahan(String pilihan, int jumMatkul) { // memilih bnykny matakuliah 
        switch (pilihan) {
            case "Y":
                System.out.println(" ");
                System.out.println("Berikut adalah List Mata Kuliah Tambahan : ");
                System.out.println("1. TEOLOGI MORAL (2 SKS) ");
                System.out.println("2. KEWARGANEGARAAN (2 SKS) ");
                System.out.println("3. FILSAFAT MORAL (2 SKS) ");
                System.out.println(" ");

                JOptionPane.showMessageDialog(null, "SILAHKAN MEMILIH MATAKULIAH SEBANYAK " + jumMatkul + " sks"); // untuk mengelurakan gui dalam java (grafik user interface)
                if (jumMatkul == 2) { // jika jumMatkul = 2 maka bisa menambah matkul, dan akan muncul kalimat daftar matkul yg diambil disemester dpn 
                    tambahMatkul = JOptionPane.showInputDialog("MATA KULIAH 1 : ");
                    System.out.println("DAFTAR MATA KULIAH YANG DIAMBIL : ");
                    System.out.println("1.  PENDIDIKAN PANCASILA ");
                    System.out.println("2.  PEMROGRAMAN BERBASIS OBJEK 1 ");
                    System.out.println("3.  PENDIDIKAN AGAMA ");
                    System.out.println("4.  STATISTIKA ");
                    System.out.println("5.  KALKULUS ");
                    System.out.println("6.  DASAR - DASAR KOMPUTER ");
                    System.out.println("7.  DASAR KOMUNIKASI KOMPUTER DAN JARINGAN ");
                    System.out.println("8.  FCH 2 ");
                    System.out.println("9.  " + tambahMatkul); 
                } else if (jumMatkul == 4) {
                    jumAmbilnya = Integer.parseInt(JOptionPane.showInputDialog("INGIN MENGAMBIL BERAPA?"));

                    if (jumAmbilnya == 2) {
                        tambahMatkul = JOptionPane.showInputDialog("MATA KULIAH 1 : ");
                        System.out.println("DAFTAR MATA KULIAH YANG DIAMBIL : ");
                        System.out.println("1.  PENDIDIKAN PANCASILA ");
                        System.out.println("2.  PEMROGRAMAN BERBASIS OBJEK 1 ");
                        System.out.println("3.  PENDIDIKAN AGAMA ");
                        System.out.println("4.  STATISTIKA ");
                        System.out.println("5.  KALKULUS ");
                        System.out.println("6.  DASAR - DASAR KOMPUTER ");
                        System.out.println("7.  DASAR KOMUNIKASI KOMPUTER DAN JARINGAN ");
                        System.out.println("8.  FCH 2 ");
                        System.out.println("9.  " + tambahMatkul);
                    } else if (jumAmbilnya == 4) {
                        tambahMatkul = JOptionPane.showInputDialog("MATA KULIAH 1 : ");
                        tambahMatkul2 = JOptionPane.showInputDialog("MATA KULIAH 2 : ");
                        System.out.println("DAFTAR MATA KULIAH YANG DIAMBIL : ");
                        System.out.println("1.  PENDIDIKAN PANCASILA ");
                        System.out.println("2.  PEMROGRAMAN BERBASIS OBJEK 1 ");
                        System.out.println("3.  PENDIDIKAN AGAMA ");
                        System.out.println("4.  STATISTIKA ");
                        System.out.println("5.  KALKULUS ");
                        System.out.println("6.  DASAR - DASAR KOMPUTER ");
                        System.out.println("7.  DASAR KOMUNIKASI KOMPUTER DAN JARINGAN ");
                        System.out.println("8.  FCH 2 ");
                        System.out.println("9.  " + tambahMatkul);
                        System.out.println("10. " + tambahMatkul2);
                    }
                }
                break;

            case "N":
                System.out.println("DAFTAR MATA KULIAH YANG DIAMBIL : ");
                System.out.println("1. PENDIDIKAN PANCASILA ");
                System.out.println("2. PEMROGRAMAN BERBASIS OBJEK 1 ");
                System.out.println("3. PENDIDIKAN AGAMA ");
                System.out.println("4. STATISTIKA ");
                System.out.println("5. KALKULUS ");
                System.out.println("6. DASAR - DASAR KOMPUTER ");
                System.out.println("7. DASAR KOMUNIKASI KOMPUTER DAN JARINGAN ");
                System.out.println("8. FCH 2 ");
                break;
        }
    }
}

