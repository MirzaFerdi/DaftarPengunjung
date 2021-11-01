package praktikum6;

import java.util.ArrayList;
import java.util.Scanner;

public class Absen {

    ArrayList<Pengunjung> listPengunjung;

    public Absen() {
        Scanner in = new Scanner(System.in);
        this.listPengunjung = new ArrayList<>();

        while (true) {

            System.out.println("Nama Lengkap:");
            String namaLengkap = in.nextLine();
            if (namaLengkap.isEmpty()) {
                System.out.println("Error: Tidak boleh kosong!");
                continue;
            }

            System.out.println("Asal Kota:");
            String asalKota = in.nextLine();
            if (asalKota.isEmpty()) {
                System.out.println("Error: Tidak boleh kosong!");
                continue;
            }

            System.out.println("Nomor Ponsel:");
            String nomorPonsel = in.nextLine();
            if (!cekNomorPonsel(nomorPonsel)) {
                System.out.println("Error: Format salah!");
                continue;
            }

            this.listPengunjung.add(new Pengunjung(namaLengkap, asalKota, nomorPonsel));

            System.out.println("Terimakasih\n");

            cetakDaftarPengunjung();

            System.out.println("\n");
        }
    }

    // Fungsi untuk mengecek format nomor ponsel
    // Mengembalikan nilai true apabila format benar dan false apabila salah
    boolean cekNomorPonsel(String s) {
         boolean valid = false;
        
        if(s.matches("^(\\+62|62|0)8[1-9]{6,10}$")) {
            valid = true;
        }

        return valid;
    }

    // Fungsi untuk mencetak semua daftar pengunjung dalam bentuk tabel pada konsol
    // Contoh:
    // +------------------+---------------+-------------------+
    // | Nama Lengkap     | Asal Kota     | Nomor Ponsel      |
    // +------------------+---------------+-------------------+
    // | Budi Hartono     | Malang        | 1234512345        |
    // | Iwan Sutrisno    | Banyuwangi    | 23456723456       |
    // +------------------+---------------+-------------------+
    void cetakDaftarPengunjung() {
        String formatcetak = "| %-23s | %-18s | %-18s |%n";
        
        System.out.format("+-------------------------+--------------------+--------------------+%n");
        System.out.format("| Nama Lengkap            | Asal Kota          | Nomor Ponsel       |%n");
        System.out.format("+-------------------------+--------------------+--------------------+%n");
        listPengunjung.forEach((var list) -> {
            System.out.format(formatcetak, list.namaLengkap, list.asalKota, list.nomorPonsel);
        });
        System.out.format("+-------------------------+--------------------+--------------------+%n");
    }
}
