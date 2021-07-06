import java.util.Scanner;

public class AppointmentTest {
public void displayMenu() {

}
public static void main(String[] args) {
    int swValue;
    Scanner inp = new Scanner(System.in);

    do {
      System.out.println("===================================");
      System.out.println("|   Mental Health Consultation    |");
      System.out.println("===================================");
      System.out.println("| Options:                        |");
      System.out.println("|        1. Option 1              |");
      System.out.println("|        2. Option 2              |");
      System.out.println("|        3. Exit                  |");
      System.out.println("===================================");
      System.out.print("Select Option: ");
      swValue = inp.nextInt();

      for (int i = 0; i < 2; i++) {
        switch (swValue) {
        case 1:
          System.out.println("Notification: Option 1 selected!");
          break;
        case 2:
          System.out.println("Notification: Option 2 selected!");
          break;
        case 3:
          System.out.println("Notification: Exit selected!");
          System.exit(0);
          break;
        default:
          System.out.println("Invalid selection");
          break;
        }
      }
    }while(swValue!=3);


  }
}
