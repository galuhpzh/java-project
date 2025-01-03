package project.AreaAndVolume.Area;
import java.util.Scanner;

public class Rectangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        double length, width, areaRectangle;
        String choice;

        System.out.println("== LUAS PERSEGI PANJANG ==");
        System.out.print("Panjang (Cm): ");
        length = scanner.nextDouble();
  
        System.out.print("Lebar (Cm): ");
        width = scanner.nextDouble();

        if (length < 0 || width < 0) {
          System.out.println("Panjang dan Lebar tidak boleh kurang dari nol");
          continue;
        } else if (length == 0 || width == 0) {
          System.out.println("Bangun datar tidak memiliki area yang terukur!.");
          continue;
        }
  
        areaRectangle = length * width;
  
        System.out.println("Luas persegi panjang: " + areaRectangle + " Cm²");

        scanner.nextLine();

        while (true) {
          System.out.print("Mau lanjut? (y/t): ");
          choice = scanner.nextLine();

          if (choice.equalsIgnoreCase("t")) {
            System.out.println("Program berheti!.");
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
