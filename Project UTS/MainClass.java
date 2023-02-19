package Project_UTS_Asekk;
import javax.swing.JOptionPane;
public class MainClass {
    public static void main(String[] args) {
       int jumMahas, nim;
        String prodi, nilaiA, nilaiB, nilaiC, nilaiD, nilaiE, nilaiF, nilaiG, pilihan;
        double ips;

        JOptionPane.showMessageDialog(null, "SELAMAT DATANG DI PROGRAM KRS MAHASISWA UNIVERSITAS SANATA DHARMA!");
        JOptionPane.showMessageDialog(null, "SILAHKAN MASUKKAN DATA - DATA ANDA TERLEBIH DAHULU");
        jumMahas = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Mahasiswa?"));
        Mahasiswa[] mahas1 = new Mahasiswa[jumMahas];

        Dosen dos1 = new Dosen("789732", "Paulina Heruningsih Prima Rosa S.Si, M.Sc");

        //
        for (int i = 0; i < mahas1.length; i++) {
            String nama = JOptionPane.showInputDialog("Nama Anda?");//lalu meminta user untuk memasukan nama dimana disimpan dalam variabel nama bertipe data string
            nim = Integer.parseInt(JOptionPane.showInputDialog("NIM anda? "));
            mahas1[i] = new Mahasiswa(nama, nim); //membuat array mahas1 berindex i yang diakses dari class mahasiswa dengan parameter atribut nama . nim
            prodi = JOptionPane.showInputDialog("Program Studi?");
            mahas1[i].setProdi(prodi); // untuk mengisi bagian prodi 
            nilaiA = JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Algoritma dan Pemrograman!");//meminta user untuk memasukan nilai .... yang disimpan ke var nilaiA
            nilaiB = JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Bahasa Inggris!");
            nilaiC = JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Matematika Diskret!");
            nilaiD = JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Logika Matematika!");
            nilaiE = JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Sistem Digital!");
            nilaiF = JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah FCH!");
            nilaiG = JOptionPane.showInputDialog("Masukkan Nilai Mata Kuliah Masa Depan Informatika!");
            ips = Double.parseDouble(JOptionPane.showInputDialog("Masukkan IPS Anda!"));

            mahas1[i].setNilaiA(nilaiA);//lalu mengatur array mahas1 berindex i dengan methode setNilaiA berparameter var NilaiA yang telah dinputkan user tadi
            mahas1[i].setNilaiB(nilaiB);
            mahas1[i].setNilaiC(nilaiC);
            mahas1[i].setNilaiD(nilaiD);
            mahas1[i].setNilaiE(nilaiE);
            mahas1[i].setNilaiF(nilaiF);
            mahas1[i].setNilaiG(nilaiG);
            mahas1[i].setIpsMahas(ips);

        }

        dos1.setMahas(mahas1);//memodifikasi object dos1. dengan methode setMahas menggunakan parameter mahas1 // MENAMPILKAN HASIL INPUTAN DATA MAHASISWA 
        Mahasiswa[] dataMahas = dos1.getMahas(); // mengatur objek baru data mahas dari array Mahasiswa untuk memiliki nilai sama dgn dos1.getMahas

        System.out.println("////===== KARTU RENCANA STUDI UNIVERSITAS SANATA DHARMA =====\\\\");
        System.out.println("                        Prodi Informatika");
        System.out.println("-----------------------------------------------------------------");
        System.out.println(" ");

        System.out.println(" ");

        for (int i = 0; i < mahas1.length; i++) {
            System.out.println("DATA MAHASISWA " + (i + 1) + " : ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Nama                : " + dataMahas[i].getNama());
            System.out.println("NIM                 : " + dataMahas[i].getNim());
            System.out.println("Prodi               : " + dataMahas[i].getProdi());
            System.out.println("Dosen Pembimbing    : " + dos1.getNama());
            System.out.println(" ");

            System.out.println("DAFTAR NILAI: ");
            System.out.println("---------------------------------");
            System.out.println("ALGORITMA DAN PEMROGRAMAN   : " + mahas1[i].getNilaiA());
            System.out.println("BAHASA INGGRIS              : " + mahas1[i].getNilaiB());
            System.out.println("MATEMATIKA DISKRET          : " + mahas1[i].getNilaiC());
            System.out.println("LOGIKA MATEMATIKA           : " + mahas1[i].getNilaiD());
            System.out.println("SISTEM DIGITAL              : " + mahas1[i].getNilaiE());
            System.out.println("FCH                         : " + mahas1[i].getNilaiF());
            System.out.println("MASA DEPAN INFORMATIKA      : " + mahas1[i].getNilaiG());
            System.out.println("---------------------------------");
            System.out.println("TOTAL IPS           : " + mahas1[i].getIpsMahas());

            if (mahas1[i].getIpsMahas() < 3) { // untuk mengatur jika ips kurang dari 3 maka akan digunakan 
                mahas1[i].tentuMatkul(mahas1[i].getIpsMahas());
                mahas1[i].ambilMatkul(0);
            } else if (mahas1[i].getIpsMahas() >= 3.00 && mahas1[i].getIpsMahas() < 3.5) {
                mahas1[i].tentuMatkul(mahas1[i].getIpsMahas());
                mahas1[i].ambilMatkul(mahas1[i].jumMatkul);
                pilihan = JOptionPane.showInputDialog("APAKAH ANDA INGIN MENAMBAH? (Y/N)");
                mahas1[i].tambahan(pilihan, mahas1[i].jumMatkul);
            } else {
                mahas1[i].tentuMatkul(mahas1[i].getIpsMahas());
                mahas1[i].ambilMatkul(mahas1[i].jumMatkul);
                pilihan = JOptionPane.showInputDialog("APAKAH ANDA INGIN MENAMBAH? (Y/N)");
                mahas1[i].tambahan(pilihan, mahas1[i].jumMatkul);
            }
            System.out.println("/////////////////////////////////////////////////////////////////");
            System.out.println(" ");
        }

        Mahasiswa terendah, tertinggi;//lalu masuk kedalam mengurutkan nilai tertinggi
        terendah = tertinggi = mahas1[0]; // var terendah dan tertinggi disimpan ke array mahas1 berincdex 0

        for (int k = 0; k < mahas1.length; k++) {
            if (mahas1[k].getIpsMahas() > tertinggi.getIpsMahas()) {
                tertinggi = mahas1[k];
            } else if (mahas1[k].getIpsMahas() < terendah.getIpsMahas()) {
                terendah = mahas1[k];
            }
        }
        JOptionPane.showMessageDialog(null, "TERIMAKASIH ATAS PERHATIANNYA, TUHAN MEMBERKATI");
        System.out.println("NILAI TERTINGGI NIM     : " + tertinggi.getNim());
        System.out.println("                Nama    : " + tertinggi.getNama());
        System.out.println("                Prodi   : " + tertinggi.getProdi());
        System.out.println("                IPS     : " + tertinggi.getIpsMahas());
        System.out.println("--------------------------------------------------");

        System.out.println("NILAI TERENDAH  NIM     : " + terendah.getNim());
        System.out.println("                NAMA    : " + terendah.getNama());
        System.out.println("                Prodi   : " + terendah.getProdi());
        System.out.println("                IPS     : " + terendah.getIpsMahas());

    }
}


