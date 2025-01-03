package project.Beginner.Calculator.Simple;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,###.##");

    while (true) {
      try {

        System.out.println("\n+-----------------------------------------+");
        System.out.println("| Kalkulator Sederhana                      |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1. Penjumlahan  (+) | 2. Pengurangan  (-) |");
        System.out.println("| 3. Perkalian    (*) | 4. Pembagian    (/) |");
        System.out.println("| 5. Keluar                                 |");
        System.out.println("+-------------------------------------------+");
        System.out.print("Masukkan pilihan operasi (1/2/3/4/5): ");
        
        int pilihan = 0;
        boolean mainMenu = false;
        while (!mainMenu) {
          try {

            pilihan = scanner.nextInt();
            if (pilihan >= 1 && pilihan <= 5) {
              mainMenu = true;
            } else {
              System.out.println("Pilih angka 1 - 5.");
              System.out.print("Masukkan pilihan lagi: ");
            }

          } catch (Exception e) {
            System.out.println("Input harus angka!.");
            System.out.print("Masukkan pilihan lagi: ");
            scanner.next();
          }
        }

        if (pilihan == 5) {
          System.out.println("Program berhenti!.");
          break;
        }

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil;

        switch (pilihan) {
          case 1:
            hasil = angka1 + angka2;
            System.out.println("\nHasil penjumlahan dari " + df.format(angka1) + " + " + df.format(angka2) + " adalah: "+ df.format(hasil));
            break;
            
          case 2:
            hasil = angka1 - angka2;
            System.out.println("\nHasil pengurangan dari " + df.format(angka1) + " - " + df.format(angka2) + " adalah: "+ df.format(hasil));
            break;

          case 3:
            hasil = angka1 * angka2;
            System.out.println("\nHasil perkalian dari " + df.format(angka1) + " * " + df.format(angka2) + " adalah: "+ df.format(hasil));
            break;

          case 4:
            if (angka2 != 0) {
              hasil = angka1 / angka2;
              System.out.println("\nHasil pembagian dari " + df.format(angka1) + " / " + df.format(angka2)+ " adalah: "+ df.format(hasil));
              break;
            } else {
              System.out.println("\n" );
              System.out.println("Hasil pembagian " + angka1 + " / " + angka2 + " adalah tak terhingga!.");
              break;
            }
        }

      } catch (Exception e) {
        System.out.println("Input not valid!.");
        scanner.next();
      }
    }
    scanner.close();
  }
}