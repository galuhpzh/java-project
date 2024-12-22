package project.AreaAndVolume.Area;
import java.util.Scanner;

public class Kite {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        double diagonal1, diagonal2, areaKite;
        String choice;
  
        System.out.print("Diagonal 1 (Cm): ");
        diagonal1 = scanner.nextDouble();
  
        System.out.print("Diagonal 2 (Cm): ");
        diagonal2 = scanner.nextDouble();

        if (diagonal1 < 0 || diagonal2 < 0) {
          System.out.println("Diagonal tidak boleh kurang dari nol!.");
          continue;
        } else if (diagonal1 == 0 || diagonal2 == 0) {
          System.out.println("Bangun datar tidak memiliki area yang terukur!.");
          continue;
        }
  
        areaKite = 0.5 * diagonal1 * diagonal2;
  
        System.out.println("Luas Layang-Layang: " + areaKite + " Cm²");

        scanner.nextLine();

        while (true) {
          System.out.print("Mau lanjut? (y/t): ");
          choice = scanner.nextLine();

          if (choice.equalsIgnoreCase("t")) {
            System.out.println("Program berhenti!.");
            scanner.close();
            return;
          } else if (choice.equalsIgnoreCase("y")) {
            System.out.println("Program dilanjutkan!.");
            break;
          } else {
            System.out.println("Harap masukkan pilihan yang valid!.");
          }
        } 
      } catch (Exception e) {
        System.out.println("Input tidak valid!.");
        scanner.next();
      }
    }
  }
}
