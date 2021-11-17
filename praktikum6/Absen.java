package praktikum6;

import java.util.ArrayList;
import java.util.Scanner;

public class Absen {

    ArrayList<Pengunjung> listPengunjung;
   
     ArrayList<String> namakota;
    

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
            if(!asalKota.contains("Kediri")) {
                if(!asalKota.contains("Malang")) {
                    if(!asalKota.contains("Blitar")) {
                        if(!asalKota.contains("Probolinggo")) {
                            if(!asalKota.contains("Pasuruan")) {
                                if(!asalKota.contains("Mojokerto")) {
                                    if(!asalKota.contains("Madiun")) {
                                        if(!asalKota.contains("Surabaya")) {
                                            if(!asalKota.contains("Batu")) {
                                                System.out.println("Error: Nama kota harus di jawa timur");
                                                continue;
                                            }                    
                                        }                    
                                    }                    
                                }                    
                            }                    
                        }                    
                    }                    
                }
            }
            
            System.out.println("Nomor Ponsel:");
            String nomorPonsel = in.nextLine();
            if (!cekNomorPonsel(nomorPonsel)) {
                System.out.println("Error: Format salah!");
                continue;
            }
            
            System.out.println("Email:");
            String Email = in.nextLine();
            if (!cekEmail(Email)) {
                System.out.println("Error: Format salah!");
                continue;
            }

            this.listPengunjung.add(new Pengunjung(namaLengkap, asalKota, nomorPonsel,Email));

            System.out.println("Terimakasih\n");

            cetakDaftarPengunjung();

            System.out.println("\n");
        }
    }

    
    
    boolean cekNomorPonsel(String s) {
        return (s.matches("^(\\+62|62|0)8[1-9]{6,10}$"));
    }
    boolean cekEmail(String e) {
        return (e.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b"));
    }

    
    
    void cetakDaftarPengunjung() {
        String formatcetak = "| %-23s | %-18s | %-18s | %-20s |%n";
        
        System.out.format("+-------------------------+--------------------+--------------------+----------------------+%n");
        System.out.format("| Nama Lengkap            | Asal Kota          | Nomor Ponsel       | Email                |%n");
        System.out.format("+-------------------------+--------------------+--------------------+----------------------+%n");
        listPengunjung.forEach((var list) -> {
            System.out.format(formatcetak, list.namaLengkap, list.asalKota, list.nomorPonsel,list.Email);
        });
        System.out.format("+-------------------------+--------------------+--------------------+----------------------+%n");
    }
}
