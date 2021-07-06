/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menentukan_bilangan_prima;

/**
 *
 * @author A S U S
 */
import java.util.Scanner;
public class Menentukan_bilangan_prima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, faktor=0;
        
        System.out.println("Program menentukan bilangan prima atau bukan");
        System.out.print("Masukan angka : ");
        bil=input.nextInt();
        
        System.out.println("--------------------------------------------");
        for (int i=2; i<=bil; i++){
            if (bil%1==0){
                faktor++;
            }
        }
        
        if (faktor==1){
            System.out.println(bil+" adalah bilangan prima");
        }else{
            System.out.println(bil+" bukan bilangan prima");
        }
    }
    
}
