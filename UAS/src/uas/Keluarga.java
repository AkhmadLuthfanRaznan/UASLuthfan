
package uas;

//inheritance
class Ayah extends Orang {
    private String pekerjaan;
    
    //konstruktor
    public Ayah(String nama, int umur, String pekerjaan){
        super(nama,umur);
        this.pekerjaan=pekerjaan;
    }
    
    //polymorphisme
    public void perkenalan(){
        System.out.println("Halo, saya Ayah. Nama saya"+getNama()+", Umur saya"+getUmur
        ()+"tahun. Saya bekerja sebagai"+pekerjaan+".");
    }
    
}
//subclass :ibu
class Ibu extends Orang {
    private String pekerjaan;
    
    //konstruktor
    public Ibu(String nama, int umur, String pekerjaan){
        super(nama,umur);
        this.pekerjaan=pekerjaan;
    }
    
    //polymorphisme
    public void perkenalan(){
        System.out.println("Halo, saya Ibu. Nama saya"+getNama()+", Umur saya"+getUmur
        ()+"tahun. Saya bekerja sebagai"+pekerjaan+".");
    }
    
}

//subclass :anak
class Anak extends Orang {
    private String pekerjaan;
    
    //konstruktor
    public Anak(String nama, int umur, String pekerjaan){
        super(nama,umur);
        this.pekerjaan=pekerjaan;
    }
    
    //polymorphisme
    public void perkenalan(){
        System.out.println("Halo, saya Ibu. Nama saya"+getNama()+", Umur saya"+getUmur
        ()+"tahun. Saya bekerja sebagai"+pekerjaan+".");
    }
    
}

