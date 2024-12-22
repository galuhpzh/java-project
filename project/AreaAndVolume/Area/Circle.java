package project.AreaAndVolume.Area;
import java.util.Scanner;

public class Circle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        double radius, areaCircle;
        String choice;
  
        System.out.println("== LUAS BANGUN DATAR LINGKARAN ==");
        System.out.print("Masukkan jari-jari (r² Cm): ");
        radius = scanner.nextDouble();

        if (radius < 0) {
          System.out.println("Jari-jari tidak boleh kurang dari 0!.");
          continue;
        } else if (radius == 0) {
          System.out.println("Bangun datar tidak memiliki area yang terukur!.");
          continue;
        }
  
        areaCircle = Math.PI * radius * radius;
  
        System.out.println("Luas lingkaran: " + areaCircle + " Cm²");

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
