package praktikum6;

public class Pengunjung {
    public String namaLengkap;
    public String asalKota;
    public String nomorPonsel;
    public String Email;
    

    public Pengunjung(String namaLengkap, String asalKota, String nomorPonsel, String Email) {
        this.namaLengkap = namaLengkap;
        this.asalKota = asalKota;
        this.nomorPonsel = nomorPonsel;
        this.Email = Email;
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
    public String getEmail()
    {
        return Email;
    }
}

