/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toystore;

/**
 *
 * @author SUPERUSER
 */
public class ToyStoreLogik {
    private String id,nama_mainan;
    private double hrg_satuan,jumlah,sub_total,pajak,total;
    
    public ToyStoreLogik(){ // konstruktor untuk class
        id="";
        nama_mainan="";
        hrg_satuan=0;
        jumlah=0;
        sub_total=0;
        pajak=0;
        total=0;
    }
    
    public void setId(String id){
        this.id=id;
    }
    
    public void setNama(String nama_mainan){
        this.nama_mainan=nama_mainan;
    }
    
    public void setHrgSatuan(double hrg_satuan){
        this.hrg_satuan=hrg_satuan;
    }
    
    public void setJumlah(double jumlah){
        this.jumlah=jumlah;
    }
    public void setSubTotal(double sub_total){
        this.sub_total=sub_total;
    }
    public double getSubTotal(){
        sub_total = hrg_satuan * jumlah;
        return(sub_total);
    }
      
    public double getPajak(){
        pajak = sub_total * 0.1;
        return(pajak);
    }
    
    public double getTotal(){
        total = sub_total + pajak;
        return(total);
    }
}