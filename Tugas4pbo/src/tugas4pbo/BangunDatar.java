/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oktaviana larasati
 */
public class BangunDatar {
    protected String Macam;
    
    public void view (){
        System.out.println("Nama Bangun datar adalah ");
    }
}
 class Persegi extends BangunDatar {
     protected double sisi;
     public Persegi (double sisi){
         this.sisi = sisi;
         
     }
     public double Luas(double sisi){
         return Math.pow(sisi,2);
        
         
     }
     public double Keliling (double sisi){
         return  4*sisi;
         
     }
     public void view (){
         double l = Luas (sisi);
         double k = Keliling (sisi);
         super.view();
         System.out.println("Persegi ");
         System.out.println("Luas Persegi = "+l+" cm^2");
         System.out.println("Keliling Persegi = "+k+" cm");
         
     }
     
 }

class Lingkaran extends BangunDatar{
    protected double jarijari;
    
    public Lingkaran (double jarijari){
        this.jarijari = jarijari;
        
    }
    public double Luas (double jarijari ){
        return 3.14*(Math.pow(jarijari,2));
       
    }
    public double Keliling(double jarijari){
        return 2*3.14*jarijari;
        
    }
    public void view (){
        
        super.view();
        System.out.println("Lingkaran");
        System.out.println("Luas Lingkaran     = " +Luas(jarijari)+"cm^2");
        System.out.println("Keliling Lingkaran = "+Keliling(jarijari)+"cm");
        
    }
}
class Segitiga extends BangunDatar{
    protected double a;
    protected double t;
    
    public Segitiga (double a, double t){
        this.a = a;
        this.t = t;
        
    }
    public double Luas ( double a, double t){
        return (a*t)/2;
        
    }
    public void view1 (double a, double t){
        super.view();
        System.out.println("Segitiga");
        System.out.println("Luas Segitga = "+Luas(a,t)+"cm^2");
        
    }
    public void view2 (double a){
        super.view();
        System.out.println("Segitiga");
        System.out.println("Luas Segitiga = "+Luas(a,t)+"cm^2");
    }
}
class  SegitigaSikuSiku extends Segitiga{
    
    public SegitigaSikuSiku(double a, double t){
        super(a,t);
        
    }
    public double SisiMiring(double a, double t){
        return Math.sqrt(Math.pow(a,2)+Math.pow(t,2));
        
    }
    public double Keliling (double a, double t){
        return a+t+(SisiMiring(a,t));
        
    }
    public void view (double a, double t){
        double k1 = Keliling(a,t);
        super.view1(a, t);
        System.out.println("Jenis Segitiganya adalah Segitiga Siku-Siku.");
        System.out.println("Keliling segitiga = "+k1+"cm");
        
    }
}

class SegitigaSamaSisi extends Segitiga{
    
    public SegitigaSamaSisi (double a, double t){
        super (a,t);
        
    }
    public double Keliling (double a){
        return  3*a;
    }
    
    public void view (double a){
        super.view2(a);
        System.out.println("Jenis Segitiganya adalah Segitiga Sama Sisi");
        System.out.println("Keliling Segitiga = "+Keliling(a)+"cm" );
        
    }
}