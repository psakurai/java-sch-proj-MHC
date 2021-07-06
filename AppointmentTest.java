import java.util.Scanner;

public class AppointmentTest {
public void displayMenu() {
  System.out.println("===================================");
  System.out.println("|   Mental Health Consultation    |");
  System.out.println("===================================");
  System.out.println("| Options:                        |");
  System.out.println("|        1. Add Data              |");
  System.out.println("|        2. Delete Data           |");
  System.out.println("|        3. Display Data          |");
  System.out.println("|        4. Show Logs             |");
  System.out.println("|        5. Exit                  |");
  System.out.println("===================================");
  System.out.print("Select Option: ");
}
public void subMenu1() {
  System.out.println("===================================");
  System.out.println("|   Mental Health Consultation    |");
  System.out.println("===================================");
  System.out.println("| Options:                        |");
  System.out.println("|        1. Add Appointment             |");
  System.out.println("|        2. Doctor           |");
  System.out.println("|        3. Back                  |");
  System.out.println("===================================");
  System.out.print("Select Option: ");
}
public void subMenu1a() {
  System.out.println("===================================");
  System.out.println("|   Mental Health Consultation    |");
  System.out.println("===================================");
  System.out.println("| Options:                        |");
  System.out.println("|        1. preAppointment             |");
  System.out.println("|        2. postAppointment           |");
  System.out.println("|        3. Back                |");
  System.out.println("===================================");
  System.out.print("Select Option: ");
}
public void subMenu2() {
  System.out.println("===================================");
  System.out.println("|   Mental Health Consultation    |");
  System.out.println("===================================");
  System.out.println("| Options:                        |");
  System.out.println("|        1. Cancel Appointment             |");
  System.out.println("|        2. Delete Doctor           |");
  System.out.println("|        3. Back                 |");
  System.out.println("===================================");
  System.out.print("Select Option: ");
}
public void subMenu3() {
  System.out.println("===================================");
  System.out.println("|   Mental Health Consultation    |");
  System.out.println("===================================");
  System.out.println("| Options:                        |");
  System.out.println("|        1. Data Patient              |");
  System.out.println("|        2. Data Doctor           |");
  System.out.println("|        3. Back                  |");
  System.out.println("===================================");
  System.out.print("Select Option: ");
}
public void subMenu3a() {
  System.out.println("===================================");
  System.out.println("|   Mental Health Consultation    |");
  System.out.println("===================================");
  System.out.println("| Options:                        |");
  System.out.println("|        1. Search ID              |");
  System.out.println("|        2. Search Name           |");
  System.out.println("|        3. Back                  |");
  System.out.println("===================================");
  System.out.print("Select Option: ");
}
public void subMenu3b() {
  System.out.println("===================================");
  System.out.println("|   Mental Health Consultation    |");
  System.out.println("===================================");
  System.out.println("| Options:                        |");
  System.out.println("|        1. Search ID              |");
  System.out.println("|        2. Search Name           |");
  System.out.println("|        3. Back                 |");
  System.out.println("===================================");
  System.out.print("Select Option: ");
}
public static void main(String[] args) {
    int swValue;
    Scanner inp = new Scanner(System.in);

    do {
      displayMenu();
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
