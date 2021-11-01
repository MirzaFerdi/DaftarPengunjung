package praktikum6;

public class Pengunjung {
    public String namaLengkap;
    public String asalKota;
    public String nomorPonsel;

    public Pengunjung(String namaLengkap, String asalKota, String nomorPonsel) {
        this.namaLengkap = namaLengkap;
        this.asalKota = asalKota;
        this.nomorPonsel = nomorPonsel;
    }
    public String getnamaLengkap()
    {
        return namaLengkap;
    }
    
    public String getasalKota()
    {
        return asalKota;
    }
    
    public String getnomorPonsel()
    {
        return nomorPonsel;
    }
}

