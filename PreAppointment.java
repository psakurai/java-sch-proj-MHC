class PreAppointment extends Appointment {

public PreAppointment(Patient patient, String date, String time) {
	super(patient, date, time);
	calculateCharge();
	}

public void displayAppointment() {
		super.displayAppointment();
        System.out.printf("Deposit price    : RM %.2f\n\n", totalCharge);
}

public void calculateCharge() {
	totalCharge = firstCharge;
}
}
