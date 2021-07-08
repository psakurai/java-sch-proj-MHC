import java.util.Scanner;

public class AppointmentTest {

public static int choice, choice2 = 1;
public static Doctor [] doctorList = new Doctor[10];
public static Patient [] patientList = new Patient[100];
public static Log log = new Log();
public static Scanner inp = new Scanner(System.in);

public static void  displayMenu() {
        System.out.println("\n===================================");
        System.out.println("|   Mental Health Consultation    |");
        System.out.println("===================================");
        System.out.println("| Options:                        |");
        System.out.println("|        1. Add Data              |");
        System.out.println("|        2. Display Data          |");
        System.out.println("|        3. Show Logs             |");
        System.out.println("|        4. Exit                  |");
        System.out.println("===================================");
        System.out.print("Select Option: ");
}
public static void subMenu1() {
        System.out.println("\n===================================");
        System.out.println("|             Add Data            |");
        System.out.println("===================================");
        System.out.println("| Options:                        |");
        System.out.println("|        1. Add Appointment       |");
        System.out.println("|        2. Add Doctor            |");
        System.out.println("|        3. Back                  |");
        System.out.println("===================================");
        System.out.print("\nSelect Option: ");
}

public static void subMenu1a() {
        int choice, choice2;
        System.out.println("\n===================================");
        System.out.println("|           Add Appointment       |");
        System.out.println("===================================");
        System.out.println("| Options:                        |");
        System.out.println("|        1. preAppointment        |");
        System.out.println("|        2. postAppointment       |");
        System.out.println("|        3. Back                  |");
        System.out.println("===================================");
        System.out.print("\nSelect Option: ");
	choice = inp.nextInt();
	inp.nextLine(); // ignore whitespace

	switch(choice) {
		case 1:	
			String firstName, lastName, address, IC, contact, date, time, gender = "";
			int age;
		
			System.out.println("\nPlease enter patient's details\n");

			// Get patient's first name
			System.out.print("First Name: ");
			firstName = inp.nextLine();

			// Get patient's last name
			System.out.print("Last Name: ");
			lastName = inp.nextLine();

			// Get patient's IC number
			System.out.print("Identification Number: ");
			IC = inp.nextLine();

			// Get patient's address
			System.out.print("Address: ");
			address = inp.nextLine();

			// Get patient's contact number
			System.out.print("Contact Number: ");
			contact = inp.nextLine();

			// Get patient's gender
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
	
			// Display doctors in the system
			System.out.println("\n--Available doctor(s)-- ");
			for(int i =0;doctorList[i] != null;i++) {
				System.out.print("[" + (i+1) + "] " + doctorList[i].getName());
				System.out.println();
				}
			
			// Assign doctor to the patient
			System.out.print("Choose a doctor: ");
			choice2 = inp.nextInt();
			inp.nextLine(); // ignore whitespace
			Doctor patientDoctor = doctorList[choice2-1];

			// Set appointment date and time
			System.out.println("\n--Appointment details-- ");
			System.out.print("Appointment date: ");
			date = inp.nextLine();
			System.out.print("Appointment time: ");
			time = inp.nextLine();

			// Ask if user want to add patient to the system, and schedule new appointment
			System.out.print("\nAre you sure to register patient and confirm the appointment? (1 - YES | 2 - NO): ");
			choice2 = inp.nextInt();
			inp.nextLine();

			if(choice2 == 1) {

				// Add new patient to the patientList
				Patient newPatient = new Patient(firstName, lastName, IC, address, contact, gender, age, patientDoctor);
				for(int i = 0; i < patientList.length; i++)
   					 if(patientList[i] == null) {
      					  patientList[i] = newPatient;
    					  break;
 					   }
				System.out.println("\nPatient added to the system!");

				// Add new preAppointment into the system
				PreAppointment newPreAppointment = new PreAppointment(newPatient, date,time);
				log.addAppointment(newPreAppointment);
				System.out.println("Appointment scheduled successfully!");

				// Return to main menu
				System.out.println("\nReturning to main menu!"); 
				return;
				}

			else if(choice2 == 2) {
				subMenu1a();

			}	
			break;
		
		case 2:		
			if(patientList[0] == null) {
				System.out.println("There is no patient registered in the system. Please try again later!");
				break;
				}

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

			System.out.println("\nEnter appointment details for patient " + patientList[choice2-1].getName() + ".");

			// Set appointment date and time
			System.out.print("Appointment Date: ");
			date = inp.nextLine();
			System.out.print("Appointment time: ");
			time = inp.nextLine();

			Appointment newPostAppointment = new PostAppointment(patientList[choice2-1],date,time);
			patientList[choice2-1].updateVisitCount();
			log.addAppointment(newPostAppointment);
			break;
		case 3:
			return;

		default:
			System.out.println("\nWrong input. Please try again!");
	}
	subMenu1a();
    			
}

public static void subMenu1b() {
	String name, contact, department;

	System.out.println("\nPlease enter doctor's details\n");
	
	// Get doctor's name
	System.out.print("Name: ");
	name = inp.nextLine();

	// Get doctor's contact
	System.out.print("Contact Number: ");
	contact = inp.nextLine();

	// Get doctor's IC number
	System.out.print("Department: ");
	department = inp.nextLine();

	Doctor newDoctor=new Doctor(name, contact, department);

	for(int i = 0; i < patientList.length; i++)
   		if(doctorList[i] == null) 
		{
      		doctorList[i] = newDoctor;
    		break;
 		}

	System.out.println("\nDoctor added to the system!");
}
	

public static void subMenu3() {
        System.out.println("\n===================================");
        System.out.println("|           Display Data          |");
        System.out.println("===================================");
        System.out.println("| Options:                        |");
        System.out.println("|        1. Data Patient          |");
        System.out.println("|        2. Data Doctor           |");
        System.out.println("|        3. Back                  |");
        System.out.println("===================================");
        System.out.print("Select Option: ");
	choice = inp.nextInt();
	inp.nextLine(); // ignore whitespace
	switch(choice) {
		case 1:
			if(patientList[0] == null) {
				System.out.println("There is no patient registered in the system. Please try again later!");
				break;
				}

			System.out.println("\nList of patients");
			System.out.print("===============\n");
			for(int i = 0; i < patientList.length; i++) {
   					 if(patientList[i] == null) {
    					  break;
 					   }
			System.out.printf("%d  %-30s %-15s",(i+1),patientList[i].getName(), patientList[i].getIC());	
			System.out.println();
			}

			System.out.print("\nView which patient's details (0 to back): ");
			choice2 = inp.nextInt();
			inp.nextLine(); //ignore whitespace
			
			if(choice2 == 0)
			{
				subMenu3();
			}	

			System.out.println("Details for patient " + patientList[choice2-1].getName());
			patientList[choice2-1].displayInfo();
			break;

		case 2:
			if(doctorList[0] == null) {
				System.out.println("There is no patient registered in the system. Please try again later!");
				break;
				}
			System.out.println("\nList of doctors");
			System.out.print("===============\n");

			for(int i =0;doctorList[i] != null;i++) {
				System.out.print("[" + (i+1) + "] " + doctorList[i].getName());
				System.out.println();
				}
			
			System.out.print("\nView which doctor's details (0 to back): ");
			choice2 = inp.nextInt();
			inp.nextLine(); //ignore whitespace
			if(choice2 == 0)
			{
				subMenu3();
			}
			
			System.out.println("Details for doctor " + patientList[choice2-1]);
			doctorList[choice2-1].displayInfo();
			break;
		case 3:
			return;
	
		default:
			System.out.println("Wrong input. Please try again.");
			break;
		}
	subMenu3();	
}

public static void main(String[] args) {
        int swValue;
        int swValue1;

	Doctor doctor1 = new Doctor("Dr Karim Hafizi","0111222334","Psychitric");
	Doctor doctor2 = new Doctor("Dr Jamilah Kesom","0123456781","Neurology");
	Doctor doctor3 = new Doctor("Dr Mahmud","0112556693","Brain");

 

	Patient patient1 = new Patient("Taufiq","Hakim","00089712941","Jalan Resak", "011398201", "Male", 15, doctor1);
	Patient patient2 = new Patient("Mimi","Peri","00650712941","Jalan Resak", "011874123", "Female", 15, doctor2);

	PreAppointment testPreAppointment = new PreAppointment(patient1,"25 Jan","18:00");
    PostAppointment testPostAppointment = new PostAppointment(patient2,"5 May","16:00");
	log.addAppointment(testPreAppointment);
	log.addAppointment(testPostAppointment);

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
						inp.nextLine(); //ignore whitespace

                        switch (swValue) {
                        case 1:
                                System.out.println("Notification: Option 1 selected!");
                                System.out.println();
                                do {
                                        subMenu1();
                                        swValue1 = inp.nextInt();
										inp.nextLine(); //ignore whitespace
                                        switch (swValue1) {
                                        case 1:
                                                System.out.println();
                                                System.out.println();
                                                subMenu1a();
                                                break;
                                        case 2:
                                                System.out.println();
												System.out.println();
												subMenu1b();
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
								subMenu3();
                                
                                break;
                        case 3:
                                System.out.println("Notification: Option 4 selected!");
                                System.out.println();
								log.displayList();
								System.out.print("\nWhich appoinment details you want to see ?: ");
								choice = inp.nextInt();
								inp.nextLine(); // ignore whitespace
								log.displayAppointmentDetails(choice);
                                break;
                        case 4:
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
                System.out.println("Exception thrown: " + e);
        }
}
}