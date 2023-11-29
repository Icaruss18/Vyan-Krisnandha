/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RYZEN 3
 */
    import java.util.Scanner;

public class BmiKalkulatorUts {

    public String cekIndeks(double tinggiBadan, double beratBadan) {
        double bmi = beratBadan / (tinggiBadan * tinggiBadan);

        if (bmi < 18.5) {
            return "Kurus (ayo makan yang banyak dan olahraga)";
        } else if (bmi <= 24.9) {
            return "Normal (pertahankan)";
        } else if (bmi <= 29.9) {
            return "Gendut (ayo olahraga rutin)";
        } else {
            return "Obesitas (Diet, olahraga dan kunjungi dokter segera)";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan (dalam meter): ");
        double tinggiBadan = scanner.nextDouble();

        System.out.print("Masukkan berat badan (dalam kilogram): ");
        double beratBadan = scanner.nextDouble();

        BmiKalkulatorUts kalkulator = new BmiKalkulatorUts();

        String hasil = kalkulator.cekIndeks(tinggiBadan, beratBadan);
        System.out.println("Indeks: " + hasil);

        scanner.close();
    }
}
