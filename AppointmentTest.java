import java.util.Scanner;

public class AppointmentTest {
public static void  displayMenu() {
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
public static void subMenu1() {
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
public static void subMenu1a() {
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
public static void subMenu2() {
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
public static void subMenu3() {
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
public static void subMenu3a() {
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
public static void subMenu3b() {
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
        int swValue1;
        Scanner inp = new Scanner(System.in);
        try {
                do {
                        displayMenu();
                        swValue = inp.nextInt();

                                switch (swValue) {
                                case 1:
                                        System.out.println("Notification: Option 1 selected!");
                                        //subMenu1();
                                        //swValue1 = inp.nextInt();
                                        break;
                                case 2:
                                        System.out.println("Notification: Option 2 selected!");
                                        //subMenu2();
                                        break;
                                case 3:
                                        System.out.println("Notification: Option 2 selected!");
                                        //subMenu3();
                                        break;
                                case 4:
                                        System.out.println("Notification: Option 2 selected!");
                                        break;
                                case 5:
                                        System.out.println("Notification: Exit selected!");
                                        System.exit(0);
                                        break;
                                }

                }while(swValue!=5);
        } catch (Exception e) {
                System.out.println("Exception thrown  :" + e);
        }
}
}
