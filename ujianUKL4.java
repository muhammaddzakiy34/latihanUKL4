package UKL2025;

import java.util.Scanner;

public class ujianUKL4 {
         // Fungsi untuk menghitung volume tabung
    public static double hitungVolume(double Jarijari, double tinggi) {
        
        return Math.PI * Jarijari * Jarijari * tinggi;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jari-jari dan tinggi
        System.out.print("Masukkan jari-jari alas tabung: ");
        double r = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi tabung: ");
        double h = scanner.nextDouble();
        
        // Hitung volume menggunakan fungsi
        double volume = hitungVolume(r, h);
        
        // Output hasil
        System.out.printf("Volume tabung dengan jari-jari %.2f dan tinggi %.2f adalah %.2f satuan kubik.%n", r , h, volume);
        
        scanner.close();
    }

}
