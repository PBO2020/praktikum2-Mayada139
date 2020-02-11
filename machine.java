/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopi;

import java.util.ArrayList;
import java.util.Scanner;

public class machine {

    Scanner Keyboard = new Scanner(System.in);

    ArrayList<Kopi> kopi = new ArrayList<Kopi>();
    ArrayList<Topping> topping = new ArrayList<Topping>();

    public static void main(String[] args) {
        machine m = new machine();
        m.all();
    }

    void all() {

        Kopi arabic = new Kopi();
        Kopi robusta = new Kopi();
        Kopi flores = new Kopi();
        Topping chocolate = new Topping();
        Topping krim = new Topping();
        Topping boba = new Topping();
        //Arabic
        arabic.setNamakopi("Arabica");
        arabic.setAsalkopi("Timur Tengah");
        arabic.setStokkopi(31);
        kopi.add(arabic);
        //Robusta
        robusta.setNamakopi("Robusta");
        robusta.setAsalkopi("Eropa");
        robusta.setStokkopi(40);
        kopi.add(robusta);
        //Flores
        flores.setNamakopi("Flores");
        flores.setAsalkopi("Asia");
        flores.setStokkopi(20);
        kopi.add(flores);
        //Chocolate
        chocolate.setTopping("Chocolate");
        chocolate.setStoktopping(10);
        topping.add(chocolate);
        //Krim
        krim.setTopping("Krim");
        krim.setStoktopping(50);
        topping.add(krim);
        //Boba
        boba.setTopping("Boba");
        boba.setStoktopping(31);
        topping.add(boba);

        System.out.println("Menu Kopi");
        for (int i = 0; i < kopi.size(); i++) {
            int j = i + 1;
            System.out.println("\t" + j + "" + kopi.get(i).getNamakopi());
        }

        System.out.println("");
        System.out.println("Menu Topping");
        for (int i = 0; i < kopi.size(); i++) {
            int j = i + 1;

            System.out.println("\t" + j + "" + topping.get(i).getTopping());
        }
        try {
            kopi.size();
            System.out.println("");
            System.out.println("Masukan kopi yang mau dipilih ");
            System.out.println("Masukan pilihan :");
            int pilih = Keyboard.nextInt() - 1;
            System.out.println("");
            System.out.println("Pesanan anda adalah kopi " + kopi.get(pilih).getNamakopi() + " yang berasal dari " + kopi.get(pilih).getAsalkopi());
        } catch (Exception e) {

            System.out.println("Inputan anda salah");
            System.out.println("");
            System.out.println(e);
            all();
        }
    }
}
