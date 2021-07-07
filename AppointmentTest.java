import java.util.Scanner;
import java.util.ArrayList;

public class AppointmentTest {

public int choice;
public static Doctor [] doctorList = new Doctor[10];
public static Patient [] patientList = new Patient[100];
public static Log log = new Log();

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
        System.out.println("|             Add Data            |");
        System.out.println("===================================");
        System.out.println("| Options:                        |");
        System.out.println("|        1. Add Appointment             |");
        System.out.println("|        2. Doctor           |");
        System.out.println("|        3. Back                  |");
        System.out.println("===================================");
        System.out.print("Select Option: ");
}

public static void subMenu1a() {
        int choice;
        System.out.println("===================================");
        System.out.println("|           Add Appointment       |");
        System.out.println("===================================");
        System.out.println("| Options:                        |");
        System.out.println("|        1. preAppointment        |");
        System.out.println("|        2. postAppointment       |");
        System.out.println("|        3. Back                  |");
        System.out.println("===================================");
        System.out.print("Select Option: ");
	choice = inp.nextInt();
	inp.nextLine(); // ignore whitespace

	switch(choice) {
		case 1:	
			String firstName, lastName, address, IC, contact, date, gender = "" ;
			int age, choice2 = 0;
		
			System.out.println("\nPlease enter patient's details\n");

			System.out.print("First Name: ");
			firstName = inp.nextLine();

			System.out.print("Last Name: ");
			lastName = inp.nextLine();

			System.out.print("Identification Number: ");
			IC = inp.nextLine();

			System.out.print("Address: ");
			address = inp.nextLine();

			System.out.print("Contact Number: ");
			contact = inp.nextLine();

			do {
			System.out.print("Gender (1 - Male | 2 - Female): ");
			choice2 = inp.nextInt();
				if(choice2==1) {
					gender = "Male"; }
			
				else if(choice2==2) {
					gender = "Female"; }

				else {
					System.out.println("Wrong input. Please try Again\n");
					}
			} while(choice2 != 1 && choice2 != 2) ;
						
			inp.nextLine(); // ignore whitespace
			
			System.out.print("Age: ");
			age = inp.nextInt();

			inp.nextLine(); // ignore whitespace
	
			System.out.println("\nAvailable doctor(s): ");
			for(int i =0;doctorList[i] != null;i++) {
				System.out.print("[" + (i+1) + "] " + doctorList[i].getName());
				System.out.println();
				}
			
			System.out.print("Choose a doctor: ");
			choice2 = inp.nextInt();
			inp.nextLine(); // ignore whitespace
			Doctor patientDoctor = doctorList[choice2-1];

			System.out.print("\nAre you sure to register patient and confirm the appointment? (1 - YES | 2 - NO): ");
			choice2 = inp.nextInt();

			if(choice2 == 1) {
				Patient newPatient = new Patient(firstName, lastName, IC, address, contact, gender, age, patientDoctor);
				
				for(int i = 0; i < patientList.length; i++)
   					 if(patientList[i] == null) {
      					  patientList[i] = newPatient;
    					  break;
 					   }
                                        }
			else if(choice2 == 2) {
				subMenu1a();

				System.out.println("\nPatient added to the system!");
				PreAppointment newPreAppointment = new PreAppointment(newPatient, "7 jULY");
				log.addAppointment(newPreAppointment);
				System.out.println("Appointment scheduled successfully!"); 
				
				System.out.println("\nReturning to main menu!"); 
				displayMenu();}
				
			break;
		
		case 2:		
			System.out.println("\n--Patient List--");
			System.out.println("\nNo Patient Name                   IC Number");

			for(int i = 0; i < patientList.length; i++) {
   					 if(patientList[i] == null) {
    					  break;
 					   }
			System.out.printf("%d  %-30s %-15s",(i+1),patientList[i].getName(), patientList[i].getIC());	
			System.out.println();
			}
			
			System.out.print("\n\nFollow-up appointment for which patient? : ");
			choice2 = inp.nextInt();
			inp.nextLine(); // ignore whitespace

			patientList[choice2-1].displayInfo();
			patientList[choice2-1].getDoctor().displayInfo();

			System.out.print("Appointment Date: ");
			date = inp.nextLine();

			PostAppointment newPostAppointment = new PostAppointment(patientList[choice2-1],date);
			patientList[choice2-1].updateVisitCount();
			log.addAppointment(newPostAppointment);
			break;
		case 3:
			displayMenu();
			break;

		default:
			System.out.println("\nWrong input. Please try again!");
	}
    			
}


public static void subMenu2() {
        System.out.println("===================================");
        System.out.println("|            Delete Data          |");
        System.out.println("===================================");
        System.out.println("| Options:                        |");
        System.out.println("|        1. Cancel Appointment    |");
        System.out.println("|        2. Delete Doctor         |");
        System.out.println("|        3. Back                  |");
        System.out.println("===================================");
        System.out.print("Select Option: ");
}

public static void subMenu3() {
        System.out.println("===================================");
        System.out.println("|   Mental Health Consultation    |");
        System.out.println("===================================");
        System.out.println("| Options:                        |");
        System.out.println("|        1. Data Patient          |");
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

	Doctor doctor1 = new Doctor("Halim","0111222334","Psychitric");
	Doctor doctor2 = new Doctor("Jamilah","999","Neurology");
	Doctor doctor3 = new Doctor("Kassim","555","Brain");

	Patient patient1 = new Patient("Halim","Kasim","999","Jalan Resak", "nombor tepon", "Male", 15, doctor1);
	Patient patient2 = new Patient("Ramli","Bajaja","999","Jalan Resak", "nombor tepon", "Male", 15, doctor2);
	patientList[0] = patient1;
	patientList[1] = patient2;
	doctorList[0] = doctor1;
	doctorList[1] = doctor2;
	doctorList[2] = doctor3;

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
                                System.out.println("Notification: Option 3 selected!");
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
                                System.out.println("Notification: Option 4 selected!");
                                System.out.println();
				log.displayList();
				System.out.print("\nWhich appoinment details you want to see: ");
				choice = inp.nextInt();
				inp.nextLine(); // ignore whitespace
				log.displayAppointmentDetails(choice);
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
