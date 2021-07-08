class PreAppointment extends Appointment {

public PreAppointment(Patient patient, String date, String time) {
	super(patient, date, time);
	calculateCharge();
	}

public void displayAppointment() {
		System.out.println("--Appointment details--");
		System.out.println("Patient's name   : " + patient.getName());
                System.out.println("Doctor in charge : " + patient.getDoctor().getName());
		System.out.println("Date             : " + date);
		System.out.println("Time             : " + time);
                System.out.printf("Deposit price : RM%.2f\n\n", totalCharge);
}

public void calculateCharge() {
	totalCharge = firstCharge;
}
}
