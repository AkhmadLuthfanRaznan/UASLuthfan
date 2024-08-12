
package uas;


public class Orang {
    //atribut
    private String nama;
    private int umur;
    
    //konstruktor
    public Orang (String nama, int umur){
        this.nama   =nama;
        this.umur   =umur;
    }
    
    //acessor
    public String getNama(){
        return nama;
    }
    
    public int getUmur(){
        return umur;
    }
    
    //mutator
    public void setNama(String nama){
        this.nama   =nama;
    }
    
    public void setUmur(int umur){
        this.umur   =umur;
    }
    
    //method
    public void perkenalan(){
        System.out.println("Halo, nama saya"+nama+"Umur saya"+umur+"tahun");
    }
    
}
