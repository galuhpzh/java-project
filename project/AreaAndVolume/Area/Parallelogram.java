package project.AreaAndVolume.Area;
import java.util.Scanner;
public class Parallelogram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      try {
        double base, height, areaParallelogram;
        String choice;

        System.out.println("== LUAS JAJAR GENJANG ==");
        System.out.print("Alas (Cm): ");
        base = scanner.nextDouble();
  
        System.out.print("Tinggi (Cm): ");
        height = scanner.nextDouble();

        if (base < 0 || height < 0) {
          System.out.println("Alas dan Tinggi tidak boleh kurang dari nol");
          continue;
        } else if (base == 0 || height == 0){
          System.out.println("Bangun datar tidak memiliki area yang terukur!.");
          continue;
        }

        scanner.nextLine();
  
        areaParallelogram = base * height;
  
        System.out.println("Area jajar genjang: " + areaParallelogram + " Cm²");

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
