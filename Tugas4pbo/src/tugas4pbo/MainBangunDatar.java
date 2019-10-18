/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author oktaviana larasati
 */
public class MainBangunDatar {
    public static void main(String[] args) {
        Scanner cek = new Scanner(System.in);
        System.out.println("Pilih bangun datar yang diinginkan ");
        System.out.println("1. persegi\n2. lingkaran\n3. Segitiga");
        System.out.println("Masukkan Pilihan Anda : ");
        int pilih = cek.nextInt();
        switch (pilih){
            case 1:
                System.out.println("Masukkan panjang sisi : ");
                double sisi = cek.nextDouble();
                Persegi square = new Persegi(sisi);
                square.view();
                break;
            case 2:
                System.out.println("masukkan Panjang Jari-Jari : ");
                double jarijari = cek.nextDouble();
                Lingkaran circle = new Lingkaran(jarijari);
                circle.view();
                break;
            case 3 :
                System.out.println("Pilih Segitiga yang diinginkan");
                System.out.println("1. Segitiga Siku-Siku");
                System.out.println("2. Segitiga Sama Sisi");
                System.out.println("Masukkan Pilihan : ");
                int Dipilih = cek.nextInt();
                switch (Dipilih){
                    case 1 :
                        System.out.println("Masukkan Panjang Alas   : ");
                        double a = cek.nextDouble();
                        System.out.println("Masukkan Panjang Tinggi : ");
                        double t = cek.nextDouble();
                        SegitigaSikuSiku siku = new SegitigaSikuSiku(a,t);
                        siku.view(a,t);
                        break;
                        
                    case 2: 
                        System.out.println("Masukkan Panjang Alas   : ");
                        double alas2 = cek.nextDouble();
                        System.out.println("Masukkan Panjang Tinggi : ");
                        double tinggi2 = cek.nextDouble();
                        SegitigaSamaSisi samasisi = new SegitigaSamaSisi(alas2,tinggi2);
                        samasisi.view(alas2);
                        break;
                                
                }
                
                
        }
    }
}
