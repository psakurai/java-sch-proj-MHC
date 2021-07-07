import java.util.Scanner;
import java.util.ArrayList;

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
        System.out.println("|        3. Back               |");
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
public static void subMenu3ab() {
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
public static void main(String[] args) {
        int swValue;
        int swValue1;
        int swValue2;
        int swValue3;
        Scanner inp = new Scanner(System.in);
        try {
                do {
                        displayMenu();
                        swValue = inp.nextInt();

                        switch (swValue) {
                        case 1:
                                System.out.println("Notification: Option 1 selected!");
                                System.out.println();
                                do {
                                        subMenu1();
                                        swValue1 = inp.nextInt();
                                        switch (swValue1) {
                                        case 1:
                                                System.out.println();
                                                System.out.println();
                                                subMenu1a();
                                                break;
                                        case 2:
                                                System.out.println();
                                                break;
                                        case 3:
                                                System.out.println();
                                                break;
                                        default:
                                                System.out.println("Notification: Invalid Options!");
                                                System.out.println();
                                                break;
                                        }
                                } while (swValue1!=3);
                                break;
                        case 2:
                                System.out.println("Notification: Option 2 selected!");
                                System.out.println();
                                do {
                                        subMenu2();
                                        swValue2 = inp.nextInt();
                                        switch (swValue2) {
                                        case 1:
                                                System.out.println();
                                                break;
                                        case 2:
                                                System.out.println();
                                                break;
                                        case 3:
                                                System.out.println();
                                                break;
                                        default:
                                                System.out.println("Notification: Invalid Options!");
                                                System.out.println();
                                                break;
                                        }
                                } while (swValue2!=3);
                                break;
                        case 3:
                                System.out.println("Notification: Option 2 selected!");
                                System.out.println();
                                do {
                                        subMenu3();
                                        swValue3 = inp.nextInt();
                                        switch (swValue3) {
                                        case 1:
                                                System.out.println();
                                                subMenu3ab();
                                                break;
                                        case 2:
                                                System.out.println();
                                                subMenu3ab();
                                                break;
                                        case 3:
                                                System.out.println();
                                                break;
                                        default:
                                                System.out.println("Notification: Invalid Options!");
                                                System.out.println();
                                                break;
                                        }
                                } while (swValue3!=3);
                                break;
                        case 4:
                                System.out.println("Notification: Option 2 selected!");
                                System.out.println();
                                break;
                        case 5:
                                System.out.println("Notification: Exit selected!");
                                System.out.println();
                                System.exit(0);
                                break;
                        default:
                                System.out.println("Notification: Invalid Options!");
                                System.out.println();
                                break;
                        }

                }while(swValue!=5);
        } catch (Exception e) {
                System.out.println("Exception thrown  :" + e);
        }
}
}
