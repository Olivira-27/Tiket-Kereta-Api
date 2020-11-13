/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

import  java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Menu="";
    int Pilihan, JumlahTiket,Harga;
    int Total=0;
    Scanner input = new Scanner(System.in);
 
        System.out.println("             PEMESANAN TIKET KERETA API               ");
        System.out.println("            -----------------------------             ");
        System.out.println("           Daftar Harga Tiket Kereta Api              ");
        
        System.out.println("NO  NAMA KERETA DAN TUJUAN                  HARGA TIKET");
        System.out.println("1.  BIMA MALANG ke SURABAYA                 Rp 60.000.-");
        System.out.println("2.  ARGOWILIS SURABAYA ke BANDUNG           Rp 410.000.- ");
        System.out.println("3.  GAJAYANA MALANG ke JAKARTA              RP 325.000.-");
       
        System.out.println("-----------------------------");
    System.out.println("Melakukan Pemesanan Tiket Kereta Api ");
    System.out.println("Masukan Nomor Tiket Yang Ingin Anda Pesan :");
    Pilihan = input.nextInt();
     switch (Pilihan){  
        case 1: 
    System.out.println("Pesanan Anda BIMA MALANG ke SURABAYA                 Rp 60.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=input.nextInt();
    Harga= 60000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
     System.out.println("Silahkan melakukan transaksi pembayaran");
    System.out.println("                -TERIMA KASIH-               ");
    break;                     
        case 2: 
    System.out.println("Pesanan Anda ARGOWILIS SURABAYA ke BANDUNG           Rp 410.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=input.nextInt();
    Harga= 410000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Silahkan melakukan transaksi pembayaran");
    System.out.println("                -TERIMA KASIH-               "); 
    break;                     
        case 3:
    System.out.println("Pesanan Anda GAJAYANA MALANG ke JAKARTA              RP 325.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=input.nextInt();
    Harga= 325000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Silahkan melakukan transaksi pembayaran");
    System.out.println("                -TERIMA KASIH-               ");
             
    {
