import java.util.ArrayList;

class Log {
private ArrayList <Appointment>appointments;

public Log()
{
        appointments = new ArrayList<>();
}

public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
}

public void displayList() {
	
	System.out.println("--List of appointments--");
        System.out.println("\nNo\tPatient Name\t\tDate\tDoctor");
        for(int i = 0; i < appointments.size(); i++)
        {
		System.out.printf("%d  %-30s %-15s %-20s",(i+1),appointments.get(i).getPatient().getName(),appointments.get(i).getDate(), appointments.get(i).getPatient().getDoctor().getName());
		System.out.println();
        }

}	

public void displayAppointmentDetails(int choice) {
	System.out.println("Here is the details for Appointment " + (choice));
	appointments.get(choice-1).displayAppointment();
}


}
