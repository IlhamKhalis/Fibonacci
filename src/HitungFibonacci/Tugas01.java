/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HitungFibonacci;
import java.util.Scanner;
/**
 *
 * @author Ilham
 */
public class Tugas01 {
    public static void main(String[] args) {
        String identitas = "Ilham Khalis Putra Agatha / X RPL 2 / 17";
        int [] nominal =  {3000, 2000, 500, 200, 100};
        Scanner sistem = new Scanner(System.in);
        
        System.out.println("Identitas : " + identitas);
        System.out.print("Masukkan nominal : ");
        
        int uang = sistem.nextInt();
        
        for (int i=0;i<5;i++){
            int jumlah = uang/nominal[i];
            uang = uang - (nominal[i]*jumlah);
     
            System.out.println("Lembar"+ nominal[i]+ " = " +jumlah);
        }
    }
}
